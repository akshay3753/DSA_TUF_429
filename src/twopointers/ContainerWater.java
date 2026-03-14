package twopointers;

public class ContainerWater {
    public static int ContainerWater(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right){
            int width = right - left;
            maxArea = width * Math.min(height[left], height[right]);
            if(maxArea > result){
                result = maxArea;
            }
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] height = {4,8,6,2};
        int result = ContainerWater(height);
        System.out.println(result);
    }
}
