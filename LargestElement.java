/*1.Given an array of integers nums, return the value of the largest element in the array


Examples:
Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6

Input: nums = [3, 3, 0, 99, -40]

Output: 99

Explanation: The largest element in array is 99

PYTHON CODE:

class Solution:
    def largestElement(self, nums):
       largestElement=nums[0];
       for nums in num:
        if num>largestElement:
        largestElement=num;
        return largestElement;


JAVA CODE: */

public class LargestElement {
    public static int findLargest(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        int largest = nums[0];
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3, 6, 1};
        System.out.println(findLargest(nums1));  // Output: 6

        int[] nums2 = {3, 3, 0, 99, -40};
        System.out.println(findLargest(nums2)); // Output: 99
    }
}