
/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Star


{
    public static void c (){
        int c = 0;
        for (int z=0;z<10;z++){
            c++;
            printItem(" ", c);
            printItem("*", 10-c);
            
            
            
            
            System.out.println();
            
        
        }
        
    
    
    
    
    }
    public static void b (){
        int b = 0;
        for (int i=10;i>0;i--){
            b++;
            
            printItem(" ", 10-b);
            
            printItem("*", b);
            
            
            System.out.println();
            
        
        }
        
        
        
        
        }
    public static void a(){
        for (int b=10;b>0;b--){
            printItem("*", b);
            System.out.println();
        
        }
    
    }
    public static void d(){
        int d, j, k;
        for(d=1;d<=5;d++)
        {
            for(j=d;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<(d*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(d=4;d>=1;d--)
        {
            for(j=5;j>d;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<(d*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printItem(String letter, int num)
    {
        for(int i=num; i>0; i--)
        {
            System.out.print(letter);
        }
    }
    }

