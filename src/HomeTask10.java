import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeTask10 {

    public static void main(String[] args) {
        int comp[] = new int[7];
        for (int i = 0; i < comp.length; i++) {
            Random random = new Random();
            comp[i] = random.nextInt(10);
        }
        Arrays.sort(comp);

        System.out.println("Введите 7 цифр от 0 до 9: ");
        Scanner scanner = new Scanner(System.in);
        int person[] = new int[7];
        for (int i = 0; i < person.length; i++) {
            person[i] = scanner.nextInt();

        }
        Arrays.sort(person);
        System.out.print(Arrays.toString(comp));
        System.out.println("");
        System.out.print(Arrays.toString(person));

        int coincidence = 0;
        for (int i = 0; i < 7; i++) {
            if (comp[i]==person[i])coincidence++;
        }
        System.out.println("Совпадений:" + coincidence);
    }
}

