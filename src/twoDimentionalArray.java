public class twoDimentionalArray {
    public static void main(String[] args) {
        //another type of declaration
//        int myArr[][]=new int[2][3];
//       myArr[0][0]=9;

        //one type of declaration
        int arr[][]={{1,2,3},{4,5,6},{7,8}};
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);
        //two dimentional array Traversal
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
