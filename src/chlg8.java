import java.util.Scanner;

public class chlg8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=input.nextInt();
        int newNum=reverseNum(num);
        System.out.println("The Reverse Number is:" +newNum);

    }
    public static int reverseNum(int num){
        int newNum=0;
        while(num>0){
            int digit =num%10;
            newNum=(newNum*10)+digit;
            num/=10;

        }
        return newNum;
    }
}
