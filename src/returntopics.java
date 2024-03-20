import java.util.Scanner;

public class returntopics {
    public static void main(String[] args) {
       greet();
        int first=readNum();//method call is not that much of special;it is like a value
        int second=readNum();
        System.out.print("The addition is:" +(first+second));

    }
    public static int readNum(){
        //for read the statement from the user

        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=input.nextInt();
        return num;

    }
    public static void greet(){
        System.out.println("Welcome to the Calculator");
    }
}
