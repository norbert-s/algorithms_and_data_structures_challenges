package org.example;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        //String []str = {"eat","tea","tan","ate","nat","bat"};
        String []str = {"a"};
        System.out.println(groupAnagrams(str));
    }
    //mine accepted
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i< strs.length;i++){

            char[] ordered = strs[i].toCharArray();

            Arrays.sort(ordered);
            String orderedString = new String(ordered);

            if(map.containsKey(orderedString)){
                int indexInBiglist = map.get(orderedString);
                list.get(indexInBiglist).add(strs[i]);
            }else{
                int indexInBiglist = list.size();
                map.put(orderedString,indexInBiglist);
                list.add(new ArrayList<>(List.of(strs[i])));
            }
        }
        System.out.println(list);
//        for(Map.Entry<char[], Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        return list;
    }
    //lc official
    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

}
