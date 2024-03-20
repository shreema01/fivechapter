import java.util.Scanner;

public class chlg1 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner  input=new Scanner(System.in);//scanner object creation
        //welcome msg print kora
        System.out.println("Welcome to Multiplication world");
        System.out.println("Please Enter your number:");
        int num=input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
        int i=1;
        while(i<=10){
            System.out.println(num+ "X" + i +"=" +(num*i));
            i++;

        }
    }
}
