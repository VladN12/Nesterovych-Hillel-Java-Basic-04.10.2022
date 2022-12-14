import java.util.Scanner;

public class Person {

    public static void main(String[] args) {


        PersonInfo phone = new PersonInfo();

        String Person1 = "Позвонить гражданину"+ " "+ phone.Name1("Will")+phone.LastName1("Smith")+" "+"из города"+" "+ phone.City1("NewYork")+" "+"можно по номеру"+" "+ phone.Phone1("2936729462846");
        System.out.println(Person1);

        String Person2 = "Позвонить гражданину"+ " "+ phone.Name2("Jackie ")+phone.LastName2("Chan ")+" "+"из города"+" "+ phone.City2("Shanghai ")+" "+"можно по номеру"+" "+ phone.Phone2("12312412412");
        System.out.println(Person2);

        String Person3 = "Позвонить гражданину"+ " "+ phone.Name3("Sherlock")+phone.LastName3("Holmes ")+" "+"из города"+" "+ phone.City3("London ")+" "+"можно по номеру"+" "+ phone.Phone3("37742123513");
        System.out.println(Person3);




    }


}