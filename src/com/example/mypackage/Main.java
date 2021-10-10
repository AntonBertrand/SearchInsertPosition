package com.example.mypackage;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.

public class Main {

    public static void main(String[] args) {
	int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] == target) {
                return i;
            }

        }

        for (int i = 0; i < nums.length ; i++) {

            if (target < nums[i]) {
                return i;
            }

        }

            return nums.length;

    }

}
