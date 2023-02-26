package br.com.dkzit.leetcode;


import java.util.HashMap;
import java.util.Map;

/*

    Link:
    https://leetcode.com/problems/two-sum/

    Description:
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
 */

public class Solution0001 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapIndex = new HashMap<>();

        int diffToTarget = 0;

        for(int i = 0; i < nums.length; i++) {
            diffToTarget = target - nums[i];
            if(mapIndex.containsKey(diffToTarget)) {
                return new int[] {mapIndex.get(diffToTarget), i};
            }
            mapIndex.put(nums[i], i);
        }

        return new int[] {};

    }

}

