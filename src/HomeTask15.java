import java.util.Arrays;
import java.util.Scanner;

enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA;
}

class PriceCounter {
    public static int COFFEE_CONSTANT = 25;
    public static int TEA_CONSTANT = 20;
    public static int LEMONADE_CONSTANT = 45;
    public static int MOJITO_CONSTANT = 50;
    public static int MINERAL_CONSTANT = 15;
    public static int COCA_COLA_CONSTANT = 65;
}


    public class HomeTask15 {
        public static void main(String[] args) {


            String stop = "Yes";
            Scanner scanner = new Scanner(System.in);
            String menu ;

            int totalPrice = 0;



            do {
                System.out.println("Choose your drink : ");
                System.out.println(Arrays.toString(DrinksMachine.values()));

                menu = scanner.nextLine();


                switch (menu) {
                    case "COFFEE":
                        totalPrice += PriceCounter.COFFEE_CONSTANT;
                        System.out.println(DrinksMachine.COFFEE + " - Price - " + PriceCounter.COFFEE_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    case "TEA":
                        totalPrice += PriceCounter.TEA_CONSTANT;
                        System.out.println(DrinksMachine.TEA + " - Price - " + PriceCounter.TEA_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    case "LEMONADE":
                        totalPrice += PriceCounter.LEMONADE_CONSTANT;
                        System.out.println(DrinksMachine.LEMONADE + " - Price - " + PriceCounter.LEMONADE_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    case "MOJITO":
                        totalPrice += PriceCounter.MOJITO_CONSTANT;
                        System.out.println(DrinksMachine.MOJITO + " - Price - " + PriceCounter.MOJITO_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    case "MINERAL_WATER":
                        totalPrice += PriceCounter.MINERAL_CONSTANT;
                        System.out.println(DrinksMachine.MINERAL_WATER + " - Price - " + PriceCounter.MINERAL_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    case "COCA_COLA" :
                        totalPrice += PriceCounter.COCA_COLA_CONSTANT;
                        System.out.println(DrinksMachine.COCA_COLA + " - Price - " + PriceCounter.COCA_COLA_CONSTANT);
                        System.out.println("Anything else ? - Yes/No");
                        stop = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Incorrect order");
                }
            }
            while (!stop.equals("No"));
            System.out.println("Total Price for your order : " + totalPrice);
        }

    }







