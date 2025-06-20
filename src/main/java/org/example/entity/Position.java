package org.example.entity;

public class Position {
    private static final String COLUMNS = "ABCDEFGH";
    private final int row; // 0 to 7
    private final int col; // 0 to 7

    public Position(String pos) {
        if (pos.length() != 2)
            throw new IllegalArgumentException("Invalid position: " + pos);

        char colChar = pos.charAt(0);
        char rowChar = pos.charAt(1);

        col = COLUMNS.indexOf(colChar);
        row = 8 - Character.getNumericValue(rowChar);

        if (!isValid(row, col)) {
            throw new IllegalArgumentException("Position out of bounds: " + pos);
        }
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static boolean isValid(int row, int col ) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public Position move(int dr, int dc) {
        int newRow = this.row + dr;
        int newCol = this.col + dc;
        if (!isValid(newRow, newCol))
            return null;
        return new Position(newRow, newCol);
    }

    @Override
    public String toString() {
        return COLUMNS.charAt(col) + Integer.toString(8 - row);
    }
}
