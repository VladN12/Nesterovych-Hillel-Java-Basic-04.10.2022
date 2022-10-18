import java.util.Random;

public class HomeTask8 {


    public static void main(String[] args) {
        int[] team1;
        team1 = new int[25];
        int i = 0;

        System.out.println("Возраст Игроков Первой Команды ! ");

        for (; i < team1.length; i++) {

            Random random = new Random();
            team1[i] = 18 + random.nextInt(40 - 18);
            System.out.println(team1[i] + " " + " Лет ");
        }

        double sum1 = 0;
        for (int x = 0 ;x<team1.length; x++) {
            sum1 += team1[x];
        }
        System.out.println("Средний возраст команды номер 1 = : " + sum1 / team1.length);
        System.out.println("---------------------------------------------");


        int[] team2;
        team2 = new int[25];
        int x = 0;

        System.out.println("Возраст Игроков Второй Команды ! ");

        for (; x < team2.length; x++) {

            Random s = new Random();
            team2[x] = 18 + s.nextInt(40 - 18);
            System.out.println(team2[x] + " " + " Лет ");


        }
        double sum2 = 0;
        for (int z=0; z<team2.length;z++) {
            sum2 += team1[z];
        }
        System.out.println("Средний возраст команды номер 2 = : " + sum2 / team1.length);
        System.out.println("---------------------------------------------");


        if (sum1 > sum2)
            System.out.println("Средний возраст первой команды больше");

        else if (sum1 == sum2)
            System.out.println("Средний возраст равен");

        else
            System.out.println("Средний возраст второй команды больше");


        System.out.println("---------------------------------------------");


        // не обошлось без помощи гугла )) но как вы учили - это главное умение будущего програмиста


    }
}

