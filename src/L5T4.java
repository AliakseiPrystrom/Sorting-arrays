import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class L5T4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mass = new int[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][i] = random.nextInt(10);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][i] = random.nextInt(10);
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println();
        }

    }
}