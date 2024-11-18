package DSA_GATE.Assignment2;

import java.util.Arrays;

public class question6 {
    public static boolean tripletSum(int arr[],int target){
        

        Arrays.sort(arr);
        

        for(int i=0;i<arr.length;i++){

            int low=i+1;
            int high=arr.length-1;

            while(low<high){
                int currSum=arr[i]+arr[high]+arr[low];

                if(currSum==target){
                    System.out.println("Triplet Sum: ["+arr[i]+","+arr[low]+","+arr[high]+"]");
                    return true;
                }
                
                else if(currSum<target){
                    low++;
                }else{
                    high--;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={40,20,10,3,6,7};
        if(!tripletSum(arr, 24 )){
            System.out.println("false");
        };
    }
}
