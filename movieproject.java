import movieticket.dispmovie;                                                                                       //packages
import payment.pay;
import theatres.cinema;
import java.util.Scanner;

class movie
{
    void wlcm()
    {
        System.out.println("---------------------------WELCOME TO MOVIE TICKET BOOKING SYSTEM---------------------------");
        System.out.println("");
    }
}
class movie1 extends movie                                                                                           //Inheritence  
{
    void info()
    {
        System.out.println("HERE YOU CAN BOOK TICKETS BY PROVIDING THE REQUIRED INFORMATION AND PAYING THE TICKET FEES");
        System.out.println("");
    }
}
class steps
{
    private String name;
    steps()                                                                                                          //constructor
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter your name:");
        this.name=sc.nextLine();                                                                                     //this keyword
        String s1= name.substring(0, 1).toUpperCase();                                                               //String Methods
        String s2=name.substring(1);
        String s3=s1 + s2;                           
        System.out.println("");                                                  
        System.out.println("welcome Mr."+s3+",thanks for choosing our movie ticket booking system");
        System.out.println("");
        System.out.println("1.SELECT YOUR MOVIE DETAILS .");
        System.out.println("2.SEARCH AND SELECT THE TICKETS.");
        System.out.println("3.PROCCED THE PAYMENT FOR THE PURCHASE.");
        System.out.println("");
    }
}

class movieproject
{
public static void main(String args[])
{
 movie1 movi=new movie1();                                                                                           //Objects and Classes
 movi.wlcm();
 movi.info();
 steps stp=new steps();
    
dispmovie dmovie=new dispmovie();
dmovie.moviedisplay();
Scanner sc=new Scanner(System.in);
moviebook m=new moviebook();
cinema cin=new cinema();

int c=sc.nextInt();

pay p=new pay();

switch (c)                                                                                                          //Switch case
{
case 1 :
           System.out.println("");
           System.out.println("you selected sitaramam");
           cin.cinematheatre();
           System.out.println("you tickets for sitaramam are booked");
           break;
case 2 :
           System.out.println("");
           System.out.println("you selected bramastra");
           cin.cinematheatre();
           System.out.println("you tickets for bramastra are booked");
           break;
case 3 :
           System.out.println("");
           System.out.println("you selected avatar 2d");
           cin.cinematheatre();
           System.out.println("you tickets for avatar 2d are booked");
           break;
case 4 :
           System.out.println("");
           System.out.println("you selected avatar 3d");
           cin.cinematheatre();
           System.out.println("you tickets for avatar 3d are booked");
           break;
case 5 :
           System.out.println("");
           System.out.println("you selected okeokageevitam");
          cin.cinematheatre();
           System.out.println("you tickets for okeokageevitam are booked");
           break;
case 6 :
           System.out.println("");
           System.out.println("you selected captain");
           cin.cinematheatre();
           System.out.println("you tickets for captain are booked");
           break;
case 7 :
           System.out.println("");
           System.out.println("you selected godfather");
           cin.cinematheatre();
           System.out.println("you tickets for godfather are booked");
           break;
default :
           System.out.println("enter in range of 1-7");
           break;

}
}
}
