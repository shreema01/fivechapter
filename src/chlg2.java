import java.util.Scanner;

public class chlg2 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner input=new Scanner(System.in);
        //welcome msg print kora
        System.out.println("Welcome to Multiplication world");
        System.out.print("Please Enter your number:");
        int num=input.nextInt();
        int sum=oddSum(num);
        System.out.print("OddSum till " + num + " is:" + sum);

    }
    public static int  oddSum(int num){
       int  sum=0;
        int i=1;
        while(i<=num){
          sum+=i;
            i+=2;
        }
        return sum;
    }

}
