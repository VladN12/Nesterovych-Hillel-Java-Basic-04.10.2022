public class HomeTask14 {
    public static void main(String[] args) {
        AccountInfo Info = new AccountInfo("Влад", 1960, "ajajasd@gmail.com", "+3837123123937", "Нестерович", "105", "120/80", 20);
        AccountInfo Info1 = new AccountInfo("Кирил", 198, "ajasdsaj@gmail.com", "+3837123123937", "Петрович", "105", "120/80", 2220);
        AccountInfo Info2 = new AccountInfo("Саша", 1970, "aasdsafgmail.com", "+38379123437", "Нестерович", "105", "120/80", 210);
        AccountInfo Info3 = new AccountInfo("Дима", 1968, "aaaaa@gmail.com", "+383712937", "Нестерович", "105", "120/59", 220);
        AccountInfo Info4 = new AccountInfo("Назар", 1985, "ajaafsasfj@gmail.com", "+3837123123937", "Нестерович", "105", "120/90", 15);

        Info.printAccountInfo();
        Info1.printAccountInfo();
        Info2.printAccountInfo();
        Info3.printAccountInfo();
        Info4.printAccountInfo();



    }
}

class AccountInfo {
    private  String name;
    private  int yearOfBirthday;
    private  String email;
    private  String phoneNumber;
    private String lastName;
    private String weight;
    private String pressure;
    private int amountOfSteps;
    private final int age = 2022;


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

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setWeight(String weight) {
        this.weight = weight;
    }

    private void setPressure(String pressure) {
        this.pressure = pressure;
    }

    private void setAmountOfSteps(int amountOfSteps) {
        this.amountOfSteps = amountOfSteps;
    }

    void printAccountInfo() {
        System.out.println(name + " " + lastName + "," + yearOfBirthday + "," + email + "," + phoneNumber + "," + weight + "," + pressure + "," + amountOfSteps + " Ваш возраст " + (age - yearOfBirthday) + "года");
    }

}





