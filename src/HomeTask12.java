public class HomeTask12 {

    public static void main(String[] args) {


        Person person1 = new Person();
        person1.Name = "Will";
        person1.LastName = "Smith";
        person1.City = "NewYork";
        person1.PhoneNumber = "2936729462846";
        System.out.println("Позвонить гражданину " + person1.Name + " " + person1.LastName + "из города " + person1.City + "можно по номеру " + person1.PhoneNumber);

        Person person2 = new Person();
        person2.Name = "Jackie";
        person2.LastName = "Chan";
        person2.City = "Shanghai";
        person2.PhoneNumber = "12312412412";
        System.out.println("Позвонить гражданину " + person2.Name + " " + person2.LastName + "из города " + person2.City + "можно по номеру " + person2.PhoneNumber);

        Person person3 = new Person();
        person3.Name = "Sherlock";
        person3.LastName = "Holmes";
        person3.City = "London";
        person3.PhoneNumber = "37742123513";
        System.out.println("Позвонить гражданину " + person3.Name + " " + person3.LastName + "из города " + person3.City + "можно по номеру " + person3.PhoneNumber);


    }


}

class Person {
    String Name;
    String LastName;
    String City;
    String PhoneNumber;
}
