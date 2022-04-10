
package taksimetrehesaplayanprogram;
import java.util.*;
public class TaksimetreHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz(km cinsinden):");
        int mesafe = input.nextInt();
        
        double ucret = 10 + (mesafe*2.20);
        
        if(ucret<20)
        {
            ucret = 10+ (mesafe*2.20) + 20;
        }
        
        System.out.println("Taksimetre ücreti:" + ucret);
        
        
    }
    
}
