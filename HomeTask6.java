import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HomeTask6 {

    public static void main(String[] args) {


        String team1 = "Terrorist";
        int firstPlayerT = 15;
        int secondPlayerT = 21;
        int thirdPlayerT = 7;
        int fourthPlayerT = 12;
        int fifthPlayerT = 25;


        double averageNumbersOfKillsT = (firstPlayerT + secondPlayerT + thirdPlayerT + fourthPlayerT + fifthPlayerT) / 5;


        String team2 = "Counter-Terrorist";
        int firstPlayerCT = 11;
        int secondPlayerCT = 24;
        int thirdPlayerCT = 12;
        int fourthPlayerCT = 17;
        int fifthPlayerCT = 8;

        double averageNumbersOfKillsCT = (firstPlayerCT + secondPlayerCT + thirdPlayerCT + fourthPlayerCT + fifthPlayerCT) / 5;

        if (averageNumbersOfKillsT > averageNumbersOfKillsCT)
            System.out.println("Победила команда " + team1 + " набравшая " + averageNumbersOfKillsT + " очков");


        else
            System.out.println("Победила команда " + team2 + " набравшая " + averageNumbersOfKillsCT + " очков");

//просто комент 


    }

}
