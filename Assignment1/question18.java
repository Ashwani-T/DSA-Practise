package DSA_GATE.Assignment1;

public class question18 {
    public static void nextGreaterElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -> " + nextGreater);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 13 , 7, 6 , 12  };
        nextGreaterElements(arr1);
    }
}
