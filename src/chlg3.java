import java.util.Scanner;

public class chlg3 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner input=new Scanner(System.in);
        //welcome msg print kora
        System.out.println("Welcome to Factorial world");
        System.out.print("Please Enter your number:");
        int num=input.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial is: " +fact);




    }
    public static long factorial(int num){

        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
