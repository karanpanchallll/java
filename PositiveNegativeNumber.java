import java.util.Scanner;
public class PositiveNegativeNumber{
    
    public static void main(String[] args){
Scanner input =new Scanner(System.in);
System.out.println("Enter a number:");
int num = input.nextInt();
input.close();

if(num > 0){
    System.out.println("number is positive");
}
else if(num < 0){
    System.out.println("number is negative");
}
else{
    System.out.println("number is zero");
}
}
}