package DSA_GATE.Assignment2;

public class question2 {
    public static int floorInSortedArray(int num[],int target){
        int left = 0;
        int right = num.length - 1;
        int floorIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (num[mid] <= target) {
                floorIndex = mid; 
                left = mid + 1;   
            } else {
                right = mid - 1;  
            }
        }

        return floorIndex;
    }
    public static void main(String[] args) {
        int arr[]={1,2,8,10,11,12,19};
        int idx=floorInSortedArray(arr, 0);

        if(idx>=0){
            System.out.println(idx);
        }else{
            System.out.println("Floor not present");
        }
        
    }
}
