
import java.util.Scanner;
class atm{
public static void main(String[] args){
   
Scanner sc=new Scanner(System.in);
int bankBalance=10000;
int option;
System.out.println(" please enter 1 to add || 2 to debit");
option=sc.nextInt();

if(option==1){
    System.out.println("enter amount u want to add");
    int amount=sc.nextInt();
    bankBalance=bankBalance+ amount;
    System.out.println("your bankbalance is:"+bankBalance);

    }
else if(option==2){
    
     System.out.println("enter amount u want to take out");
    int amount=sc.nextInt();
     if(amount > bankBalance){
     System.out.println("insufficient balance");
     }
     else{
        bankBalance=bankBalance-amount; 
        System.out.println("your bankbalance is:" +bankBalance);
     }
 
}
else{
        System.out.println("invalid option");
     }


}


}