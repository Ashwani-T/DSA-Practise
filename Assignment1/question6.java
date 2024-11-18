package DSA_GATE.Assignment1;

public class question6 {
    public static int trappingRainWater(int boundary[]){
        int leftMax=boundary[0];
        int leftBoundary[]=new int[boundary.length];
        for(int i=0;i<boundary.length;i++){
            if(boundary[i]>leftMax){
                leftMax=boundary[i];
                leftBoundary[i]=leftMax;
            }else{
                leftBoundary[i]=leftMax;
            }
        }

        int rightMax=boundary[boundary.length-1];
        int rightBoundary[]=new int[boundary.length];

        for(int i=boundary.length-1;i>=0;i--){
            if(rightMax<boundary[i]){
                rightMax=boundary[i];
                rightBoundary[i]=rightMax;
            }else{
                rightBoundary[i]=rightMax;
            }
        }


        int water=0;
        for(int i=0;i<boundary.length;i++){
            int minHeightBar=Math.min(leftBoundary[i],rightBoundary[i]);
            water+=minHeightBar-boundary[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[]={10, 9, 0, 5};
        System.out.println(trappingRainWater(arr));
    }
}
