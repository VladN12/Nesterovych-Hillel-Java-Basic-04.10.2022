public class HomeTask14 {
    public static void main(String[] args) {
        AccountInfo Info = new AccountInfo("Влад", 1960, "ajajasd@gmail.com", "+3837123123937", "Нестерович", "105", "120/80", 20);
        AccountInfo Info1 = new AccountInfo("Кирил", 1980, "ajasdsaj@gmail.com", "+3837123123937", "Петрович", "105", "120/80", 2220);
        AccountInfo Info2 = new AccountInfo("Саша", 1970, "aasdsafgmail.com", "+38379123437", "Нестерович", "105", "120/80", 210);
        AccountInfo Info3 = new AccountInfo("Дима", 1968, "aaaaa@gmail.com", "+383712937", "Нестерович", "105", "120/59", 220);
        AccountInfo Info4 = new AccountInfo("Назар", 1985, "ajaafsasfj@gmail.com", "+3837123123937", "Нестерович", "105", "120/90", 15);

        Info.printAccountInfo();
        Info1.printAccountInfo();
        Info2.printAccountInfo();
        Info3.printAccountInfo();
        Info4.printAccountInfo();

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Изменяем данные с помощью сетеров");

        Info.setLastName("Вазовский");
        Info.setWeight("100");
        Info.setPressure("120/50");
        Info.setAmountOfSteps(800);
        Info.printAccountInfo();

        Info1.setLastName("Болгар");
        Info1.setWeight("80");
        Info1.setPressure("140/50");
        Info1.setAmountOfSteps(1800);
        Info1.printAccountInfo();

        Info2.setLastName("Левицкий");
        Info2.setWeight("120");
        Info2.setPressure("170/80");
        Info2.setAmountOfSteps(500);
        Info2.printAccountInfo();

        Info3.setLastName("Карл");
        Info3.setWeight("120");
        Info3.setPressure("100/50");
        Info3.setAmountOfSteps(7800);
        Info3.printAccountInfo();

        Info4.setLastName("Киркоров");
        Info4.setWeight("220");
        Info4.setPressure("180/90");
        Info4.setAmountOfSteps(2800);
        Info4.printAccountInfo();


    }
}

class AccountInfo {
    private final int age = 2022;
    private String name;
    private int yearOfBirthday;
    private String email;
    private String phoneNumber;
    private String lastName;
    private String weight;
    private String pressure;
    private int amountOfSteps;


    public AccountInfo(String name, int yearOfBirthday, String email, String phoneNumber, String lastName, String weight, String pressure, int amountOfSteps) {
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.amountOfSteps = amountOfSteps;
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    private String getName() {
        return name;
    }

    private int getBirthday() {
        return yearOfBirthday;
    }

    private String getEmail() {
        return email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setAmountOfSteps(int amountOfSteps) {
        this.amountOfSteps = amountOfSteps;
    }

    void printAccountInfo() {
        System.out.println(name + " " + lastName + "," + yearOfBirthday + "," + email + "," + phoneNumber + "," + weight + "," + pressure + "," + amountOfSteps + " Ваш возраст " + (age - yearOfBirthday) + "года");
    }

}





