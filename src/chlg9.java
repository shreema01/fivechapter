import java.util.Scanner;

public class chlg9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series:");
        System.out.print("please enter the number up to which series will continue:");
        int num=input.nextInt();
        System.out.println("Here is the Fibonacci Series");
        printFibonacci(num);

    }
    public static void printFibonacci(int num){
        if(num<0) return;//without return value
        System.out.print("0 ");
        if(num==0) return;//without return value
        System.out.print("1 ");
        int first=0,second=1;//ak e datatype er multiple variable print korte bebohar hoie
        while(first +second<=num){
            int third=first+second;
            System.out.print(third + " ");
            first=second;
            second=third;
        }

    }
}
