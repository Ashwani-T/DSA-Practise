package DSA_GATE.Assignment6;

import java.util.Arrays;

public class formTheLargest {
    public static String formTheLargestNumberOptimized(int nums[]){
        String str[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] =  Integer.toString(nums[i]);

        }


        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));



        StringBuilder sc = new StringBuilder();
        for (String num : str) {
            sc.append(num);
        }
        if (sc.charAt(0) == '0') {
            return "0";
        }
        return sc.toString();
    }

    public static long formTheLargestNumberBrute(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                String num1=String.valueOf(arr[i])+String.valueOf(arr[j]);
                String num2=String.valueOf(arr[j])+String.valueOf(arr[i]);

                if(num1.compareTo(num2)<0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        StringBuilder largest=new StringBuilder("");
        for(int num:arr){
            largest.append(num);
        };

        return Long.parseLong(largest.toString());

    }
    public static void main(String[] args) {
        int arr[]={3,4,6,5,9};

        System.out.println(formTheLargestNumberBrute(arr));
        System.out.println(formTheLargestNumberOptimized(arr));
    }
}
