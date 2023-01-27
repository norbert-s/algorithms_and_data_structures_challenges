package org.example.two_sum;

import org.example.hashmap.MyHashMap;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
       int [] arr = {3,2,4};
       int target = 7;
       Arrays.stream(twoSum(arr,target)).forEach(System.out::println);


    }


    //mine correct
    public int[] twoSumQuadratic(int[] nums, int target) {

        int i;
        int j=1;
        boolean found = false;
        int[] tomb = new int[2];
        for(i=0;i<nums.length-1;i++){
            if (found) break;

            for (j=i+1;j<nums.length;j++){
                int maradek = target -nums[i];
                if(nums[j]==maradek){
                    tomb[0]=i;
                    tomb[1]=j;
                    found = true;
                    break;
                }
            }

        }
        return tomb;

    }

    //https://leetcode.com/problems/two-sum/solutions/127810/two-sum/
    //lc official one passhash
    public int[] twoSumOnePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    public static int[] twoSum(int[] nums, int targetOrig) {
        if(nums==null ||nums.length==0)return new int[2];
        Set<Integer> set = new HashSet<>();

        for(Integer i: nums){
            set.add(i);
        }


        for(int i=0;i<nums.length;i++){
            int target= targetOrig-nums[i];
            if(set.contains(target)){
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]==target){
                        int [] arr = {i,j};
                        return arr;
                    }
                    j++;
                }
            }
        }
        return new int [2];

    }


    //mine incorrect approach bc
    //the index is to be returned so sorting is not going to work netiher would binary search then
    static int[] nums;
    public static int[] twoSum2(int[] numsOrig, int targetOrig) {
        Arrays.sort(numsOrig);
        nums=numsOrig;

        for(int i=0;i<nums.length;i++){
            int target= targetOrig-nums[i];
            if(target>=nums[i]){
                int res = binarSearch(i,nums.length,target);
                if(res>=0){
                    int [] finalArr = {i,res};
                    return finalArr;
                }
            }
        }
        return new int [2];

    }
    static int  binarSearch(int low,int high,int target){
        if(low>=high)return -1;
        int mid=(low+high)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(target<nums[mid]){
            return binarSearch(low,mid,target);
        }
        else{
            return binarSearch(mid+1,high,target);
        }
    }
}
