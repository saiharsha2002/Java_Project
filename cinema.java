package theatres;
import payment.pay;
import java.util.Scanner;
public class cinema
{
    public void cinematheatre()                                                                                         //Methods
    {
    Scanner sc=new Scanner(System.in);
    pay p=new pay();
    System.out.println("");
    System.out.println("SELECT THE THEATRE FOR MOVIE");
    System.out.println("");
    System.out.println("1.AMRUTHA");
    System.out.println("2.ASIAN SRIDEVI CINEMAS");
    System.out.println("3.S2[PVR]");
    System.out.println("4.GEMINI");
    System.out.println("");
     int ch=sc.nextInt();


    switch (ch)                                                                                                         //Switch
{
case 1 :
           System.out.println("");
           System.out.println("YOU HAVE SELECTED AMRUTHA");
           p.paying();
           break;
case 2 :
           System.out.println("");
           System.out.println("YOU HAVE SELECTED ASIAN SRIDEVI CINEMAS");
           p.paying();
           break;
case 3 :
           System.out.println("");
           System.out.println("YOU HAVE SELECTED S2[PVR]");
           p.paying();
           break;
case 4 :
           System.out.println("");
           System.out.println("YOU HAVE SELECTED GEMINI");
           p.paying();
           break;
default :
           System.out.println(""); 
           System.out.println("enter in range of 1-4");
           break;

}
}
}