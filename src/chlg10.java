import java.util.Scanner;

public class chlg10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        boolean isArmstrong =isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        }
        else{
            System.out.println("Your number is  not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        System.out.println("");
        int finalNumber=0;
        while(num>0){
            int lastDigit=num % 10;
            num/=10;
            finalNumber +=pow(lastDigit,noOfDigits);
        }
        //boolean er jonno is,has agge rakhle valo
        return finalNumber==num;
    }
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits=0;
        if(num>0){
            digits++;
            num/=10;

        }
        return digits;
    }
}
