package org.example.backtracking.subset_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[]args){
        int nums[]={1,2,2};
        System.out.println(subsets(nums));
    }
    static int k;
    static List<List<Integer>> res=new ArrayList<>();
    static int [] arr;
    public static List<List<Integer>> subsets(int[] nums) {
        arr = nums;
        for(k=0;k< nums.length+1;k++){
            subsetsReq(0,new ArrayList<>());
        }
        return res;
    }
    public static void subsetsReq(int index, List<Integer> curr) {
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<arr.length;++i){
            curr.add(arr[i]);
            subsetsReq(i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
