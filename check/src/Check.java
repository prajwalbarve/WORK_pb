import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class region_name{
    void name(){
        System.out.println ("Please select form the region given below:");
        System.out.println ("India");
        System.out.println ("Russia");
        System.out.println ("USA");
        System.out.println ("Egypt");
        System.out.println ("United kingdom");
        System.out.println ("Germany");
    }
}
class region extends region_name {
    void nation() {
        Scanner input = new Scanner (System.in);
            System.out.println ("Enter the region name.");
            String location = input.nextLine ();
        switch (location) {
            case "India" -> System.out.println ("Your region code is +91");
            case "Russia" -> System.out.println ("Your region code is +7");
            case "USA" -> System.out.println ("Your region code is +1");
            case "Germany" -> System.out.println ("Your region code is +49");
            case "United Kingdom", "UK" -> System.out.println ("Your region code is +44");
            case "Egypt" -> System.out.println ("Your region code is +20");
            default -> {
                System.err.println ("Invalid input.");
                System.exit (0);
            }
        }
    }
}
class phonenumber extends region{
    void phone(){
        Scanner n = new Scanner (System.in);
        System.out.println ("\nEnter your name below:");
        String name = n.nextLine ();
        System.out.print ("\nEnter the phone number:");
        String phoneN = n.next ();
        String regex = "(0|91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile (regex);
        Matcher matcher = pattern.matcher (phoneN);
        if (matcher.matches ()) {
            System.out.println ("\nName:"+name);
            System.out.println ("\nNumber:"+phoneN);
            System.out.println ("\nGiven phone number is valid ");
        } else {

            System.out.println ("\nName:"+name);
            System.out.println ("\nNumber:"+phoneN);
            System.err.println ("\nGiven phone number is invalid");
        }
    }
}
public class Check {
    public static void main(String[] args){
phonenumber p=new phonenumber ();
p.name ();
p.nation ();
p.phone ();
    }
}
