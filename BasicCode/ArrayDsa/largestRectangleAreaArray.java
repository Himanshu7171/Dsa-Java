package BasicCode.ArrayDsa;

public class largestRectangleAreaArray {
    public  static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n]; // Manual stack to store indices
        int top = -1;  // Pointer for stack
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i]; // Treat extra 0 at end

            while (top != -1 && currHeight < heights[stack[top]]) {
                int height = heights[stack[top--]]; // Pop height
                int width = (top == -1) ? i : i - stack[top] - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            

            stack[++top] = i; // Push index manually
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int height [] = {2,1,5,6,2,3} ;
        
         int result =  largestRectangleArea(height);
         System.out.println(result);
    }
}
