package DSA_GATE.Assignment1;

public class question4 {
    public static int trappedWater(int height[]) {
        int leftBoundary = 0;
        int rightBoundary = height.length - 1;
        int maxArea = 0;

        while (leftBoundary < rightBoundary) {
            int currentArea = Math.min(height[leftBoundary], height[rightBoundary]) * (rightBoundary - leftBoundary);
            maxArea = Math.max(maxArea, currentArea);

            if (height[leftBoundary] < height[rightBoundary]) {
                leftBoundary++;
            } else {
                rightBoundary--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int boundary[]={3, 0, 1, 0, 4, 0, 2};
        System.out.println(trappedWater(boundary));
    }
}
