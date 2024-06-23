import java.util.Scanner;  
  

public class ATM 
{  
     
    public static void main(String args[] )  
    {  
          
        int balance = 500000, withdraw, deposit;    
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM");  
            System.out.println("Choose 1 : Withdraw");  
            System.out.println("Choose 2 : Deposit");  
            System.out.println("Choose 3 : Check Balance");  
            System.out.println("Choose 4 : EXIT");  
            System.out.print("SELECT THE NUMBER ");  
               
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter your money to be withdrawn:");    
        withdraw = sc.nextInt();  
                 
        if(balance >= withdraw)  
        {   
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Not Enough Balance");  
        }  
         
        break;  
                case 2:                 
        System.out.print("Enter money to be deposited:");    
        deposit = sc.nextInt();   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");   
        break;  
   
                case 3:    
        System.out.println("Balance : "+balance);      
        break;  
   
                case 4:    
        System.out.println("Thank You!!");  
            }  
        }  
    }  
}  