public class TwoDimentionalArrayPr {
    public static void main(String[] args) {
        //One type of declaration
//        int newarr[][]=new int[2][3];
//        newarr[0][0]=9;

        int arr[][]={{1,2,3},{4,5,6},{7,9}};
        //Array Traversal
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;

            }

            i++;
        System.out.println();
        }

    }
}
