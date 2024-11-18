package DSA_GATE.Assignment1;
public class assignment1 {
    // kadanes algorithm
    public static int kadanesSum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            ms=Math.max(ms, cs);
            if(cs<0){
                cs=0;
            }
            
        }
        return ms;

    }
    public static void main(String[] args) {
        int arr[] ={5, 4, 1, 7, 8};
        System.out.println(kadanesSum(arr));
    }
}
