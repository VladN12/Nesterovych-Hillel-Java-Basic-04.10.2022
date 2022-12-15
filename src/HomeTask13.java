public class HomeTask13 {

    public static void main(String[] args) {
        System.out.println("Меню Бургеров: ");
        System.out.println("-------------------------------------------------------------------------");

        Burger.BurgerMain menu = new Burger.BurgerMain();
        menu.speak1();
        menu.speak2();
        menu.speak3();
        System.out.println("-------------------------------------------------------------------------");

        Burger compound = new Burger("Булочка", "Мясо", "Сыр", "Зелень", "Майонез");
        compound.Ingredient1 = "Булочка";
        compound.Ingredient2 = "Мясо";
        compound.Ingredient3 = "Сыр";
        compound.Ingredient4 = "Зелень";
        compound.Ingredient5 = "Майонез";


    }
}

class Burger {
    String Ingredient1;
    String Ingredient2;
    String Ingredient22;
    String Ingredient3;
    String Ingredient4;
    String Ingredient5;


    public Burger(String Ingredient1, String Ingredient2, String Ingredient3, String Ingredient4, String Ingredient5) {
        this.Ingredient1 = Ingredient1;
        this.Ingredient2 = Ingredient2;
        this.Ingredient3 = Ingredient3;
        this.Ingredient4 = Ingredient4;
        this.Ingredient5 = Ingredient5;

        System.out.println("Вы приготовили стандартный бурегер " + "Состав :" + Ingredient1 + "," + Ingredient2 + "," + Ingredient3 + "," + Ingredient4 + "," + Ingredient5);
    }


    public Burger(String Ingredient1, String Ingredient2, String Ingredient3, String Ingredient4) {
        this.Ingredient1 = Ingredient1;
        this.Ingredient2 = Ingredient2;
        this.Ingredient3 = Ingredient3;
        this.Ingredient4 = Ingredient4;
        System.out.println("Вы приготовили диетический бургер " + "Состав :" + Ingredient1 + "," + Ingredient2 + "," + Ingredient3 + "," + Ingredient4);
    }

    public Burger(String Ingredient1, String Ingredient2, String Ingredient22, String Ingredient3, String Ingredient4, String Ingredient5) {
        this.Ingredient1 = Ingredient1;
        this.Ingredient2 = Ingredient2;
        this.Ingredient2 = Ingredient22;
        this.Ingredient3 = Ingredient3;
        this.Ingredient4 = Ingredient4;
        this.Ingredient5 = Ingredient5;
        System.out.println("Вы приготовили бургер с двойным мясом " + "Состав :" + Ingredient1 + "," + Ingredient2 + "," + Ingredient22 + "," + Ingredient3 + "," + Ingredient4 + "," + Ingredient5);
    }
    public static class BurgerMain{
        void speak1(){
            System.out.println("Бургер классический: " + "Состав :" + "Булочка" + ","+ "Мясо" + "," + "Сыр" + "," + "Зелень" + "," + "Майонез");
        }
        void speak2(){
            System.out.println("Диетический Бургер: " + "Состав :" + "Булочка" + ","+ "Мясо" + "," + "Сыр" + "," + "Зелень");
        }
        void speak3(){
            System.out.println("Бургер Двойное Мясо: " + "Состав :" + "Булочка" + ","+ "Двойное Мясо" + "," + "Сыр" + "," + "Зелень" + "," + "Майонез");
        }

    }


}







