public class HomeTask7 {

    public static void main(String[] args) {


        first:
        for (int x = 0; x < 101; x++) {
            {
                if (x == 4 ) {
                    System.out.println("Skip unlucky number ! ");
                    continue first;
                }
                else if (x==9){
                    System.out.println("Skip unlucky number !");
                    continue first;
                }
                System.out.println("Номер Шатла"+" : "+x);
            }




        }
        System.out.println("----------------------------------------------------------------");
    }
}