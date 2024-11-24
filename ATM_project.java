import java.util.*;
public class ATM_project{
    public static void main(String[] args){

        int pin = 1234;
        int balance = 10000;

        int addamount =0;
        int takeamount =0;

        String name;
        Scanner scanner = new Scanner(System.in);
        // get input from user

        System.out.println("enter your pin number");

        int password = scanner.nextInt();

        if(password==pin)
        {
           System.out.println("enter your name");
           name = scanner.next();
           System.out.println("welcome"+ name);

           while (true) {

           
             System.out.println("press 1 to check your balance");
             System.out.println("press 2 to add amount");
             System.out.println("press 3 to take amount");
             System.out.println("press 4 to claim your recipt");
             System.out.println("press 5 to exit");

             int opt = scanner.nextInt();
             switch(opt)
             {
                case 1:
                 System.out.println("your current balance is " + balance);
                 break;

            case 2:
                System.out.println("how much amount did you want to Add to your account");
                addamount = scanner.nextInt();
                System.out.println("successfully credited");
                balance = addamount+ balance;

                break;
            
             case 3 :
               System.out.println("how much amount did you want to take");
               takeamount = scanner.nextInt();
               if(takeamount>balance)
                  {
                    System.out.println("your balance is insufficiant");
                    System.out.println("try less then your available balance");
                
                  }  
               else
               {
                System.out.println("successfully amount was taken");
                balance = balance - takeamount;

               }  
               break;
               
               case 4:
                System.out.println(" WELCOME TO ALL IN ONE MINI ATM");
                System.out.println("Available balance is "+ balance);
                System.out.println("Amount deposited " +addamount);
                System.out.println("Aamount taken"+ takeamount);
                System.out.println("Thankyou dear cutomer");
            
             break;
             default:
                   System.out.println(" press the number below 5");
                   break;
              }
             if(opt==5)
             {
                System.out.println(" Thank you");
                break;
             }
           
             

           }

        }
        else
        {
            System.out.println("Wrong pin number");
        }
  

      }
     

}