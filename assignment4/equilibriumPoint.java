package DSA_GATE.Assignment4;

public class equilibriumPoint {
    public static int equilibriumPoint(int arr[]) {
        //preffix sum

        int n=arr.length;


        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        
        int suff[]=new int[arr.length];
        suff[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(pre[i]==suff[i]){
                return i+1;
            }
        }
        
        return -1;
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,3 ,5 ,2 ,2};
        System.out.println(equilibriumPoint(arr));
    }
}
