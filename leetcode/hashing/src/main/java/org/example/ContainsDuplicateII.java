package org.example;

import java.util.*;

public class ContainsDuplicateII {

    public static void main(String[]args){
        //int [] nums = {1,2,3,1};
        int [] nums = {1,0,1,1};

        int k=1;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    //mine accepted
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List<Integer> subList = map.get(nums[i]);
                for(int j=0;j<subList.size();j++){
                    if(Math.abs(i- subList.get(j))<=k)return true;
                }
                subList.add(i);
                map.put(nums[i],subList);
            }else{
                map.put(nums[i],new ArrayList<>(List.of(i)));
            }
        }
        return false;
    }

    //lc official
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
