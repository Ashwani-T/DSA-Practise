package DSA_GATE.Assignment1;
public class question2 {
    public static int maxProduct(int arr[]){

        //bruteforce
        /*int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < arr.length; j++) {
                currentProduct *= arr[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        return maxProduct;*/


        int maxProduct=arr[0];
        int minProduct=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            
            if(current<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(current,maxProduct*current);
            //System.out.println(maxProduct);
            minProduct=Math.min(current,minProduct*current);
            //System.out.println(minProduct);
            res=Math.max(res,maxProduct);
            //System.out.println(res);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] ={-1, -3, -10, 0, 60};
        System.out.println(maxProduct(arr));

    }
}
