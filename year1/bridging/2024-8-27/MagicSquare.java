import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the square: ");
        int size = input.nextInt();
        int numOfCells = size * size;

        int square[][] = new int[size][size];

        int x = 0, y = size/2;
        for (int i = 1; i <= numOfCells; i++) {
            if (square[x][y] == 0) {
                square[x][y] = i;
            } else {
                x = x + 2;
                y--;
                if (x >= size) { x = x - size; }
                if (y < 0) { y = size - 1; }

                square[x][y] = i;
            }

            x--;
            y++;
            if (x < 0) { x = size - 1; }
            if (y == size) { y = 0; }
        }

        // Print square
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
