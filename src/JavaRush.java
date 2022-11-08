import java.util.Random;

import java.sql.SQLOutput;
import java.util.Scanner;


public class JavaRush {


    public static void main(String[] args) {
        int numberOfShuttles = 1;
        for (int x = 1; x < 10; x++) {
            if (numberOfShuttles > 100) {
                break;
            }
            if (x != 4 & x != 9) {
                for (int y = 0; y < 10; y++) {
                    if (numberOfShuttles > 100) {
                        break;
                    }
                    if (y != 4 & y != 9) {
                        for (int r = 0; r < 10; r++) {
                            if (r != 4 & r != 9) {
                                System.out.println("Шатл " + numberOfShuttles + " имеет № " + x + y + r);
                                numberOfShuttles++;
                                if (numberOfShuttles > 100) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}