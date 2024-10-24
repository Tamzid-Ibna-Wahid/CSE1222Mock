package Q2;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
    
        matrix.set(0, 0, "TopLeft");
        matrix.set(1, 1, "Center");
        matrix.set(2, 2, "BottomRight");
    
        System.out.println(matrix.get(1, 1)); 
    
        ArrayList<Cell> describedCells = matrix.getDescribedCells();
        for (Cell cell : describedCells) {
            System.out.println(cell); 
        }
    }
}
