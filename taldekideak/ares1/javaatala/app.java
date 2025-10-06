import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        


ArrayList<String> astekoegunak=new ArrayList<String>();

astekoegunak.add("Astelehena");
astekoegunak.add("Asteartea");
astekoegunak.add("Asteazkena");
astekoegunak.add("Osteguna");
astekoegunak.add("Ostirala");
astekoegunak.add("Larunbata");

Scanner sc=new Scanner(System.in);
System.out.println("Aukeratu asteko eguna");
int astekoeguna= sc.nextInt();
System.out.println(astekoegunak);



    }
}