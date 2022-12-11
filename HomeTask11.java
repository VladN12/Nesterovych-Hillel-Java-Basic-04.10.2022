import java.util.Scanner;

public class HomeTask11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] origin = new int[n][];
        int[][] result = new int[m][];

        for(int i = 0 ; i< result.length; i++)result[i] = new int[n];

        System.out.println("Оригинальная матрица");
        System.out.println("------");
        for (int i = 0; i < origin.length; i++) {
            origin[i]=new int[m];
            for (int j = 0; j < origin[i].length; j++) {
                origin[i][j]= (int)Math.round(Math.random()*10);
                System.out.print(origin[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = origin[j][i];

            }
        }
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }
    }
}
