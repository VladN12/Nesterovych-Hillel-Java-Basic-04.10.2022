import java.util.Random;
import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        int numberOfTries = 0;
        int a = 3;
        first:
        for (; numberOfTries < 3; numberOfTries++) {
            for (; i < 3; i++) {
                Scanner in = new Scanner(System.in);
                System.out.println("У тебя есть еще " + (a--)+ " попытки ");
                System.out.print("Введи число : ");
                int num = in.nextInt();
                System.out.printf("Твоё число: %d \n", num);

                Random random = new Random();
                b = random.nextInt(11);
                System.out.println("Компьютер загадал число " + ":" + b);

                if (b != num ) {
                    System.out.println("Вы НЕ угадали число ! ! ! ");
                    System.out.println("-------------------------------------");
                }
                else {
                    System.out.println("Вы победили ! ! !");
                    break first;
                }
            }
        }
    }
}









