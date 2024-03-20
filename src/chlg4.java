import java.util.Scanner;

public class chlg4 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner input=new Scanner(System.in);
        //welcome msg print kora
        System.out.println("Welcome to Sum of Digits world");
        System.out.print("Please Enter your number:");
        int num=input.nextInt();
        int sum=sumOfDigits(num);
        System.out.print("Sum of Digits is:" +sum);



    }
    public static int sumOfDigits(int num){
        int sum=0;//accumulator pattern
        while(num>0){

            sum+=num%10;//vaag sash asbe aeita te
            num=num/10;//vaag fool asbe aeita te


        }
        return sum;
    }
}
