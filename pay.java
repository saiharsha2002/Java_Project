package payment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class pay                                                                                                      //Access Modifier
{
  int i;
  int seats=0;
  boolean valid;
  String str;
    double price=200;
Scanner sc=new Scanner(System.in); 
    public void paying()
    {
      System.out.println("");
      int number=1;
      while(number<=9)
      {
        for(int i=1;i<=9;i++)
        {
            System.out.print("  "+number);
            number++;
        } 
      } 
      while(number>9 && number<=20)
      {
        for(int i=1;i<=11;i++)
        {
            System.out.print(" "+number);
            number++;
        }
        System.out.println(" ");
      }
        while(number>20 && number<=100)
        {
          for(int i=1;i<=20;i++)
          {
              System.out.print(" "+number);
              number++;
          }
          System.out.println(" ");
      }
      System.out.println("");
       System.out.println("MAXIMUM LIMIT OF SEATS SELECTING AT ONCE ARE 10");
       System.out.println("");
       while(valid==false)
       {
        System.out.print("ENTER NUMBER OF SEATS : ");
        System.out.println("");
        str=sc.nextLine();                                                                                         //Exceptions
       try                                                                                                            
       {
       seats=Integer.parseInt(str);
       valid=true;
       }
       catch(NumberFormatException ie)
       {
        System.out.println("ENTER ONLY INTEGER VALUES");
       }
       }
       int[] ticketsbooked = new int[seats]; 
      if(seats<=10)
      {
        System.out.print("ENTER SEATS YOU WANT TO SELECT : ");
        
        
        for( i=0;i<seats;i++)
        {
        ticketsbooked[i]=sc.nextInt();
        if(ticketsbooked[i]>0 && ticketsbooked[i]<=100)
        {
          System.out.println("YOU HAVE SELECTED TICKET : "+ticketsbooked[i]);
          
        }
        else
        {
          System.out.println("YOUR TICKET SEATING ARE OUT OF RANGE");
          System.exit(0);
        }  
        }
      }
      else if(seats>10)
      {
        System.out.println("NUMBER BOOKING SEATS CANNOT EXCEED 10!!");
        System.exit(0);
      }
       double gst=price*0.18;
       double amount=price*seats+seats*gst;

    for(i=0;i<ticketsbooked.length;i++)
{
System.out.print("["+ticketsbooked[i]+"],");
}
System.out.println("");

       System.out.println("YOUR TICKETS PRICE IS : "+price*seats);
       System.out.println("");
       System.out.println("GST FOR YOUR PURCHASE : "+gst*seats);
       System.out.println("");
       System.out.println("YOUR TOTAL PRICE IS (INCLUDING TAX !!) : "+amount);
       System.out.println("");
       System.out.println("ENTER 1 TO PROCEED PAYMENT ELSE 0 TO DECLINE PAYMENT ");
       System.out.println("");
       int pay=sc.nextInt();
       
       if(pay==1)
       {
        System.out.println("your payment of "+amount+"is successful :)");
        System.out.println("");
       }
       else if(pay==0)
       {
         System.out.println("your payment of"+amount+"is unsuccessful");
         System.out.println("");
         System.exit(0);
       }
       else
       {
         System.out.println("ENTER A VALID CHOICE ");
         System.out.println("");
         paying();
       }
      }   
} 
