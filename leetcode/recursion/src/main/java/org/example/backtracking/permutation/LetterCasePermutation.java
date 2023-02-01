package org.example.backtracking.permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation {

    public static void main(String[]args){
        String arr = "po";
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        System.out.println(letterCasePermutation.letterCasePermutation(arr));
    }

    String  arr;
    List<String> res = new ArrayList<>();

    Set<String> set = new HashSet<>();
    public List<String> letterCasePermutation(String s) {
        char [] array = s.toCharArray();
        set.add(s);
        res.add(s);
        letterCasePermutationRec(0,array);
        return res;
    }
    public void letterCasePermutationRec(int index,char []s) {
        if(index==s.length){
            return;
        }
        for(int i=index;i<s.length;i++){
            if(Character.isAlphabetic(s[i])&&Character.isUpperCase(s[i])){
                s[i] = Character.toLowerCase(s[i]);
                String str = String.valueOf(s);
                if(!set.contains(str)){
                    res.add(str);
                    set.add(str);
                }
            }else if(Character.isAlphabetic(s[i])&&Character.isLowerCase(s[i])){
                s[i] = Character.toUpperCase(s[i]);
                String str = String.valueOf(s);
                if(!set.contains(str)){
                    res.add(str);
                    set.add(str);
                }
            }
            letterCasePermutationRec(i+1,s);
            if(Character.isAlphabetic(s[i])&&Character.isUpperCase(s[i])){
                s[i] = Character.toLowerCase(s[i]);
            }else if(Character.isAlphabetic(s[i])&&Character.isLowerCase(s[i])){
                s[i] = Character.toUpperCase(s[i]);
            }
        }
    }
}
