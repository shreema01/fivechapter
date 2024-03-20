public class functionexample {
    public static void main(String[] args) {
     firstPattern();
//     secondPattern();
//     thirdPattern();
    }
    public static void  firstPattern(){
        System.out.println("FirstPattern:");
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");
//        int rows=0;
//        while(rows<5){
//            System.out.print("*");
//
//            int i=0;
//            while(i<rows){
//                System.out.print(" *");
//                i++;
//            }
//         System.out.println();
//            rows++;
//        }

int rows=0;
while(rows<5){
    System.out.print("*");
    int i=0;
    while(i<rows){
        System.out.print(" *");
        i++;
    }
    System.out.println();
    rows++;
}
    }
    public static void secondPattern(){
        System.out.println("SecondPattern:");
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* * ");
        System.out.println("* ");
    }
    public static void thirdPattern(){
        System.out.println("ThirdPattern:");
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }


}
