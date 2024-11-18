package DSA_GATE.Assignment1;

public class question3 {
    //search in sorted rotated array
    public static int searchElement(int arr[],int target){
        //bruteforce - linear search
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == target) {
                return mid;
            }

           
            if (arr[left] <= arr[mid]) { 
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1;
                }
            } else { 
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }
        return -1;
        

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchElement(arr,3));
    }
}
