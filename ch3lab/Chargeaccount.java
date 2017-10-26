
/**
 * Write a description of class chargeaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Chargeaccount
{
    
    public static void main (String[] args){
        double previousBal;
        double additionalCharge;
        double interest = 0.02;
        double newBal; 
        double minimumPay = 0;
        Scanner scan = new Scanner(System.in);
        Scanner add = new Scanner(System.in);
        System.out.print ("Enter your previous balance ");
        previousBal = scan.nextDouble();
        System.out.print ("Enter the amount you spend this month ");
        additionalCharge = add.nextDouble();
        newBal = ((previousBal + additionalCharge) * interest) + (previousBal + additionalCharge);
        if (newBal < 50){
            minimumPay = newBal;
        
        }
        if (newBal > 49 && newBal < 301){
            minimumPay = 50;
            
        
        }
        if (newBal > 300){
            minimumPay = newBal * 0.2;
            
        }
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println(" ");
        System.out.println("Previous Balance:" + "\t" + "\t" + " " + previousBal + "$");
        System.out.println("Additional Charges:" + "\t" + "\t" + " " + additionalCharge + "$");
        System.out.println("Interest:"  + "\t" + "\t" + "\t" + " " + interest + "%");
        System.out.println(" ");
        System.out.println("New Balance:"  + "\t" + "\t" + "\t" + " " + newBal + "$");
        System.out.println(" ");
        System.out.println("Minimum Payment:"  + "\t" + "\t" + " " + minimumPay + "$");
        
        
        

        
    
    }
    
    
}
