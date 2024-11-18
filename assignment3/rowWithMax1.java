package DSA_GATE.assignment3;

// package DSA_GATE.assignment3;

// import java.util.Arrays;

// public class rowWithMax1 {
//     public static int getMax(int arr[][]){

//         int n=arr.length;
//         int m=arr[0].length;
        
//         int max=0;int row=-1;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]==1){
//                     count++;
//                 }
//             }
//             if(count>max){
//                 max=count;
//                 row=i;
//             }
//         }


//         return row;
//     }
//     public static void main(String[] args) {
//         int arr[][]={{0,1,1,1},{0,1,0,1},{1,1,1,1},{0,0,0,1}};
//         System.out.println(getMax(arr));
//     }
// }


public class rowWithMax1 {

    
    public static int rowWithMax1s(int[][] arr)
    {

        int R=arr.length;
        int C=arr[0].length;

        int maxRow = -1, row = 0, col = C - 1;

        
        while (row < R && col >= 0) {
            
            if (arr[row][col] == 0) {
                row++;
            }
            else {
                maxRow = row;
                col--;
            }
        }
        return maxRow;
    }

    public static void main(String[] args)
    {
        int[][] mat = { { 0, 1, 1, 0 },
                        { 0, 0, 1, 1 },
                        { 0, 1, 1, 1 },
                        { 0, 0, 0, 0 } };

        System.out.println(
            "Index of row with maximum 1s is "
            + rowWithMax1s(mat));
    }
}
