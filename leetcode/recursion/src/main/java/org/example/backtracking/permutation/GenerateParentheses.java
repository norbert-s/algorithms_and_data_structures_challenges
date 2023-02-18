package org.example.backtracking.permutation;

import java.util.*;
import java.util.stream.Collectors;

public class GenerateParentheses {

    //time limit exceeded
    //https://leetcode.com/problems/generate-parentheses
    public static void main(String[] args) {
        System.out.println(generateParenthesis(7));

    }

    static List<List<String>> res = new ArrayList<>();
    static List<String> original = new ArrayList<>();
    static Set<List<String>> set = new HashSet<>();
    static public List<String> generateParenthesis(int n) {
        for (int i = 0; i < n; i++) {
            original.add("(");
            original.add(")");
        }
        generateParenthesis(0, new ArrayList<>(),0);
        List<String> strList = new ArrayList<>();
        for(int i=0;i<res.size();i++){
            String str = res.get(i).stream().collect(Collectors.joining());
            strList.add(str);
        }
        return strList;
    }
    static public void generateParenthesis(int index, List<String> curr,int counter) {
        if (curr.size() == original.size()&&counter==0) {

            if (!set.contains(curr)) {
                res.add(new ArrayList<>(curr));
                set.add(new ArrayList<>(curr));
            }

            return;
        }
        if(index>=original.size())return;
        for (int i = index; i < original.size(); i++) {

            if (original.get(i).equals("(")) {
                curr.add(original.get(i));
                counter++;
            }
            if(counter==0&&original.get(i).equals(")")){
                break;
            }
            if(counter!=0&&original.get(i).equals(")")){
                curr.add(original.get(i));
                counter--;
            }
            generateParenthesis(index + 1, curr,counter);
            curr.remove(curr.size() - 1);
        }

    }
}
