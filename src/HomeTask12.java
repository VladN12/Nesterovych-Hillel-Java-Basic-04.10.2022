public class HomeTask12 {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.Name = "Will";
        person1.LastName = "Smith";
        person1.City = "NewYork";
        person1.PhoneNumber = "2936729462846";
        person1.Print();

        Person person2 = new Person();
        person2.Name = "Jackie";
        person2.LastName = "Chan";
        person2.City = "Shanghai";
        person2.PhoneNumber = "12312412412";
        person2.Print();

        Person person3 = new Person();
        person3.Name = "Sherlock";
        person3.LastName = "Holmes";
        person3.City = "London";
        person3.PhoneNumber = "37742123513";
        person3.Print();
    }


}

class Person {
    String Name;
    String LastName;
    String City;
    String PhoneNumber;

    void Print() {
        System.out.println("Позвонить гражданину " + Name + " " + LastName + "из города " + City + "можно по номеру " + PhoneNumber);
    }


}
