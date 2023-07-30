import java.util.Scanner;
import exchange_rates.India;
public class Choice  {
    void choice() {
        System.out.println("Enter countries : ");
        String coun;
        Scanner sc=new Scanner(System.in);
        coun= sc.next();
        India i=new India();
        switch (coun) {
            case "India-Usa" -> {
                System.out.println("Please proceed to enter the amount in Rupees: ");
                i.ex_India_Usa();
            }
            case "India-Russia" -> {
                System.out.println("Please proceed to enter the amount: ");
                i.ex_India_Russia();
            }
            case "India-Canada" -> {
                System.out.println("Please proceed to enter the amount: ");
                i.ex_India_Canada();
            }
            case "India-Japan" -> {
                System.out.println("Please proceed to enter the amount: ");
                i.ex_India_Japan();
            }
            default -> System.out.println("Please enter a valid entry ");
        }

     }

}

