package exchange_rates;
import java.util.Scanner;
public class India {
    float Ind;
    Scanner sc=new Scanner(System.in);
    public void ex_India_Usa(){
        final double Ex_Ind = 82.2598;
        Ind = sc.nextFloat();
        float Usa = (float) (Ind / Ex_Ind);
        System.out.println("Tne Exchange amount in USD is: " + Usa);
    }
    public void ex_India_Russia(){
        final double Ex_Ind=0.8935;
        Ind=sc.nextFloat();
        float Ruble=(float)(Ind/Ex_Ind);
        System.out.println("The Exchange amount in Russia is: "+Ruble);

    }
    public void ex_India_Canada(){
        final double Ex_Ind=62.0805;
        Ind=sc.nextFloat();
        float Canadian_Dollar=(float)(Ind/Ex_Ind);
        System.out.println("The Exchange amount in Canadian Dollar is: "+Canadian_Dollar);
    }
    public void ex_India_Japan(){
        final double Ex_Ind=0.5828;
        Ind=sc.nextFloat();
        float Japanese_yen=(float) (Ind/Ex_Ind);
        System.out.println("The Exchange amount in Japanese Yen is: "+Japanese_yen);
    }
}
