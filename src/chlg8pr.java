import java.util.Scanner;

public class chlg8pr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to ReverseWorld");
        System.out.print("Enter your num:");
        int num=input.nextInt();
        int newNum=reverse(num);
        System.out.print("The reverse number is:" +newNum);

    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit=num%10;
            newNum=(newNum*10)+digit;
            num/=10;
        }


        return newNum;
    }
}
