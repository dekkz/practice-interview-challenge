package br.com.dkzit.leetcode;

import java.util.Arrays;

/*

    Link:
    https://leetcode.com/problems/squares-of-a-sorted-array/


    Description:
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

    Example 2:
    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]

 */
public class Solution0977 {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3};

        int[] res = sortedSquares(arr);

        System.out.println(res);
    }

    // two pointer approach
    public static int[] sortedSquares(int[] nums) {

        int lengthArr = nums.length;
        int start = 0;
        int end = lengthArr - 1;

        int[] result = new int[lengthArr];

        for(int i = lengthArr - 1; i >= 0; i--) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }

        return result;
    }

}
