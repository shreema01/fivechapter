import java.util.Scanner;

public class arraySearchingPr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={2,3,5,67,89,90};
        System.out.print("Enter your number:");
        int num=input.nextInt();
        boolean isFound=isFound(arr,num);
        if(isFound){
            System.out.print("The elememnt is found in the array");
        }else{
            System.out.print("The elememnt is not found in the array");
        }

    }
    public static boolean isFound(int[] arr,int num) {
        int index = 0;
        while(index<arr.length){
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }


}
