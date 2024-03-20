import java.util.Scanner;

public class chlg5 {
    public static void main(String[] args) {
        //user theke input newa
        Scanner input=new Scanner(System.in);
        //welcome msg print kora
        System.out.println("Welcome to LCM");
        System.out.print("Please Enter your 1st number:");
        int first=input.nextInt();
        System.out.print("Please Enter your 2nd number:");
        int second=input.nextInt();
        int lcm=lcm(first,second);
        System.out.print("LCM of this number is:" +lcm);
    }
    public static int lcm(int first,int second){
        int i=1;
        while(i<=second){
            int factor=first *i;//table read of first number
            if(factor%second==0){
                return factor;
            }
            i++;
        }
        return 0;//unreachable statement
    }
}
