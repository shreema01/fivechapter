public class arrayNormal {
    public static void main(String[] args) {
        //First Option
//        int[] myArr=new int[5];
//        myArr[0] = 98;
//        myArr[1] = 65;
//        myArr[2] = 2;
//        myArr[3] = 8;
//        myArr[4] = 37;
        //Second Option
        int[] myArr={98,65,2,8,37};
        //Normal Print
//        System.out.println(myArr[0]);//[] er vitore variable o dite parbo
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        //Array Traveral(pura array ak bar ghure asha)
//        int index=0;
//        while(index<myArr.length){//5 mone rakhar kono dorker nai
//            System.out.println(myArr[index]);
//            index++;
//        }
        //it is not compulsory to have array only in the integer type,string type is also applicable
        String[] strArr=new String[4];
        strArr[0]="My String";//string er value "" er vitore lekte hoie
        String[] newStrArr={"First","Second","Third"};
        System.out.println(newStrArr.length);//ans 3 asbe karon length holo 3 e
        System.out.println(strArr.length); //ans 4 asbe karon length holo 4 e

    }

}
//Array index outofbound mane holo array length besi hoiese/- hoiaa gase
//array er size fixed hoie