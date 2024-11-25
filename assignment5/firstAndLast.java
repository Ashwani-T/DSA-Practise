package DSA_GATE.Assignment5;

public class firstAndLast {
        public static int findFirst(int[] arr, int x) {
            int left = 0, right = arr.length - 1;
            int result = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (arr[mid] == x) {
                    result = mid;
                    right = mid - 1; 
                } else if (arr[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return result;
        }
    
        
        public static int findLast(int[] arr, int x) {
            int left = 0, right = arr.length - 1;
            int result = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (arr[mid] == x) {
                    result = mid;
                    left = mid + 1; 
                } else if (arr[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return result;
        }
    
        
        public static int[] findFirstAndLast(int[] arr, int x) {
            int first = findFirst(arr, x);
            int last = findLast(arr, x);
            
            if (first == -1) {
                return new int[]{-1, -1}; 
            }
            
            return new int[]{first, last};
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
            int x = 5;
            int[] result = findFirstAndLast(arr, x);
            System.out.println("First occurrence: " + result[0]);
            System.out.println("Last occurrence: " + result[1]);
        }    
}
