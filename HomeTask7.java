public class HomeTask7 {

    public static void main(String[] args) {

        first:
        for (int x = 1; x < 14; x++) {

            if (x == 4 || x == 9) {
                continue first;
            }

            second:
            for (int y = 0; y < 11; y++) {
                if (y == 4 || y == 9) {
                    continue second;
                }


                System.out.println("Номер Шатла" + " : " + x + y);
            }


        }
        System.out.println("----------------------------------------------------------------");
    }

}
