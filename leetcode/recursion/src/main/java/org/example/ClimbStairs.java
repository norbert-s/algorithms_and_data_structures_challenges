package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ClimbStairs {
    public static void main(String[] args) {

        int num = 6;
        System.out.println(climbStairs(num));


    }
    public static int climbStairs(int n) {

        return fib(n+1);
    }
    static Map<Integer,Integer> map = new HashMap<>();
    public static int fib(int n){
        if(n<2)
            return n;
        else if(map.containsKey(n)){
            return map.get(n);
        }
        int result =  fib(n-1)+fib(n-2);
        map.put(n,result);

        return result;

    }



}
