import java.util.Scanner;

public class chlg6 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner input=new Scanner(System.in);
        //welcome msg print kora
        System.out.println("Welcome to LCM");
        System.out.print("Please Enter your 1st number:");
        int first=input.nextInt();
        System.out.print("Please Enter your 2nd number:");
        int second=input.nextInt();
        int gcd=gcd(first,second);
        System.out.print("GCD of this number is:" +gcd);
    }
    public static int gcd(int first,int second)//first and second holo aei method er jonno
     {
         int gcd=1;//1 diaa sob vagg jei aeijonno
         int i=2;
         int least=least(first,second);
         while(i <= least){
             i++;
             if(first%i==0 && second%i==0){
                 gcd = i;
             }
         }
         return gcd;
    }
    public static int least(int first,int second){
        if(first>second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }
}
