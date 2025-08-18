package Aula10SudokuSimples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MiniSudoku extends JFrame {
    private JTextField[][] cells = new JTextField[9][9];
    private int[][] puzzle = new int[9][9];
    private int[][] solution = new int[9][9];

    public MiniSudoku() {
        setTitle("Mini Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        generatePuzzle(); // Gera puzzle e solução

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(9, 9));

        // Criando células
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col] = new JTextField();
                cells[row][col].setHorizontalAlignment(JTextField.CENTER);
                cells[row][col].setFont(new Font("Arial", Font.BOLD, 20));
                if (puzzle[row][col] != 0) {
                    cells[row][col].setText(String.valueOf(puzzle[row][col]));
                    cells[row][col].setEditable(false);
                    cells[row][col].setBackground(Color.LIGHT_GRAY);
                }
                gridPanel.add(cells[row][col]);
            }
        }

        JButton checkButton = new JButton("Verificar");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidSudoku()) {
                    JOptionPane.showMessageDialog(null, "Parabéns! Sudoku correto!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! Sudoku incorreto!");
                }
            }
        });

        add(gridPanel, BorderLayout.CENTER);
        add(checkButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void generatePuzzle() {
        fillDiagonal();
        fillRemaining(0, 0);
        copySolution();
        removeCells();
    }

    // Preenche quadrados diagonais 3x3
    private void fillDiagonal() {
        for (int i = 0; i < 9; i += 3) fillBox(i, i);
    }

    private void fillBox(int rowStart, int colStart) {
        Random rand = new Random();
        boolean[] used = new boolean[9];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int num;
                do num = rand.nextInt(9) + 1;
                while (used[num - 1]);
                used[num - 1] = true;
                puzzle[rowStart + i][colStart + j] = num;
            }
    }

    private boolean fillRemaining(int i, int j) {
        if (i == 9) return true; // terminou todas as linhas
        if (j == 9) return fillRemaining(i + 1, 0); // próxima linha
        if (puzzle[i][j] != 0) return fillRemaining(i, j + 1);

        for (int num = 1; num <= 9; num++) {
            if (isSafe(i, j, num)) {
                puzzle[i][j] = num;
                if (fillRemaining(i, j + 1)) return true;
                puzzle[i][j] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int i, int j, int num) {
        for (int x = 0; x < 9; x++) if (puzzle[i][x] == num || puzzle[x][j] == num) return false;
        int startRow = i - i % 3, startCol = j - j % 3;
        for (int r = 0; r < 3; r++) for (int c = 0; c < 3; c++)
            if (puzzle[startRow + r][startCol + c] == num) return false;
        return true;
    }

    private void copySolution() {
        for (int i = 0; i < 9; i++) for (int j = 0; j < 9; j++)
            solution[i][j] = puzzle[i][j];
    }

    private void removeCells() {
        Random rand = new Random();
        int cellsToRemove = 40; // número de células vazias
        while (cellsToRemove > 0) {
            int i = rand.nextInt(9);
            int j = rand.nextInt(9);
            if (puzzle[i][j] != 0) {
                puzzle[i][j] = 0;
                cellsToRemove--;
            }
        }
    }

    private boolean isValidSudoku() {
        int[][] board = new int[9][9];
        try {
            for (int row = 0; row < 9; row++)
                for (int col = 0; col < 9; col++)
                    board[row][col] = Integer.parseInt(cells[row][col].getText());
        } catch (NumberFormatException e) {
            return false;
        }

        // Verifica linhas e colunas
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (rowCheck[board[i][j] - 1]) return false;
                rowCheck[board[i][j] - 1] = true;
                if (colCheck[board[j][i] - 1]) return false;
                colCheck[board[j][i] - 1] = true;
            }
        }

        // Verifica quadrados 3x3
        for (int boxRow = 0; boxRow < 3; boxRow++)
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] check = new boolean[9];
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 3; j++) {
                        int val = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (check[val - 1]) return false;
                        check[val - 1] = true;
                    }
            }

        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MiniSudoku::new);
    }
}
