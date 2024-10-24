package Q2;
import java.util.ArrayList;

public class Matrix {
    private String[][] grid;
    private int numRows, numColumns;

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns]; 
    }

    public void set(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description; 
        }
    }

    public String get(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column]; 
        }
        return null; 
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (grid[i][j] != null) { 
                    describedCells.add(new Cell(i, j)); 
                }
            }
        }
        return describedCells;
    }
    
}
