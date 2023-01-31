package org.example.backtracking.subset_leetcode;

import java.util.*;

public class SubsetII {
    public static void main(String[]args){
        int nums[]={1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    static int k;
    static List<List<Integer>> res=new ArrayList<>();
    static int [] arr;

    static Set<List<Integer>> set = new HashSet<>();
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        arr = nums;
        Arrays.sort(arr);
        for(k=0;k< nums.length+1;k++){
            subsetsReq(0,new ArrayList<>());
        }
        return res;
    }
    public static void subsetsReq(int index, List<Integer> curr) {
        if(curr.size()==k){
            if(!set.contains(curr)){
                res.add(new ArrayList<>(curr));
                set.add(curr);
            }

            return;
        }

        for(int i=index;i<arr.length;++i){
            curr.add(arr[i]);
            subsetsReq(i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
