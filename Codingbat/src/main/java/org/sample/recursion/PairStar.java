package org.sample.recursion;

public class PairStar {


    public String pairStar(String str) {
        if(str.length()==0)return "";
        if(str.length()>1){
            if(str.substring(0,1).equals(str.substring(1,2))){
                return str.substring(0,1)+"*"+pairStar(str.substring(1));
            }
        }

        return str.substring(0,1)+pairStar(str.substring(1));
    }

}
