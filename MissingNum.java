public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;  // Length of the array
        
        // Calculate the expected sum of numbers from 1 to n+1
        int expectedSum = (n + 1) * (n + 2) / 2;
        
        // Calculate the actual sum of the given array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};  // Example array with missing number 3
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
