public class parameter {
    public static void main(String[] args) {
//    int num=sumTwoNumbers(4,7);
//        System.out.println(num);
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(40,45));
        System.out.print(sumTwoNumbers(1,10));

    }
    public static int sumTwoNumbers(int first,int second){
        //definition mane holo parameter;value mane holo arguments
    //return 1 ta e hobe,multiple jinish return hoi na
        System.out.println("First number is received:" +first);
        System.out.println("Second number is received:" +second);
//      int sum=first +second;
//      return sum;
        return first+second;
    }
}
