import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        /*int num = 1;//initialization
        while (num <= 100000) {//condition
            System.out.println(num);//actual work
            num=num+1;//updating the condition
        }*/

//        int count=500;
//        while(count>=200) {
//            System.out.println(count);
//            count-=1;
//
//
//        }

      Scanner input=new Scanner(System.in);
      int i=0;//here 0 is the index number
      System.out.println("Enter your num:" );
      while(i<5){
          int num=input.nextInt();
          System.out.println("Enter your num:" +num );
          i=i+1;
      }


    }
}

