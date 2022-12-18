public class HomeTask14 {
    public static void main(String[] args) {
        AccountInfo Info = new AccountInfo("Влад", 1960, "ajaj@gmail.com", "+3837937", "Нестерович", "105", "120/80", 20);
        Info.printAccountInfo();


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





