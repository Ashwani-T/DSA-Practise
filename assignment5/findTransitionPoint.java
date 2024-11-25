package DSA_GATE.Assignment5;

public class findTransitionPoint {
        public static int findTransitionPoints(int[] arr) {
            int n = arr.length;
            
            
            if (arr[n - 1] == 0) {
                return -1;
            }
            
            
            if (arr[0] == 1) {
                return 0;
            }
    
            int left = 0, right = n - 1;
          
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                    return mid;
                } else if (arr[mid] == 0) {
                   
                    left = mid + 1;
                } else {
                   
                    right = mid - 1;
                }
            }
    
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr1 = {0, 0, 0, 1, 1, 1};
            int[] arr2 = {0, 0, 0, 0, 0};
            int[] arr3 = {1, 1, 1, 1, 1};
            
            System.out.println(findTransitionPoints(arr1)); 
            System.out.println(findTransitionPoints(arr2)); 
            System.out.println(findTransitionPoints(arr3)); 
        }    
}
