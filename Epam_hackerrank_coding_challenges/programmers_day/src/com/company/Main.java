package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(dayOfProgrammer(1979));
    }


    public static String dayOfProgrammer(int year) {
        String date = "";
        if ( year <= 1917) {
            int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(year%4==0){
                a[1]=29;
            }
            int osszeg = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j <= a[i]; j++) {
                    osszeg += 1;
                    System.out.println(osszeg);
                    if (osszeg == 256) {
                        date= dateString(i+1,j,year);
                    }
                }
            }
        }
        else if (year == 1918) {
            int[] a = {31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int osszeg = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j <= a[i]; j++) {
                    osszeg += 1;
                    System.out.println(osszeg);
                    if (osszeg == 256) {
                        date= dateString(i+1,j,year);
                    }
                }
            }
        }
        else if (year > 1918 && year <= 2700) {
            int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(year%400==0 || (year%4==0 && year%100!=0)){
                a[1] =29;
            }
            int osszeg = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j <= a[i]; j++) {
                    osszeg += 1;
                    System.out.println(osszeg);
                    if (osszeg == 256) {
                        date= dateString(i+1,j,year);
                    }
                }
            }
        }
        return date;
    }

    public static String dateString(int i,int j,int year){
        String datum ="";
        String nap = "";
        String honap = "";
        if(j>0 && j<10){
            nap += "0"+j;
        }
        else {
            nap +=j;
        }
        if(i>0 && i<10){
            honap += "0"+i;
        }
        else{
            honap += i;
        }
        datum += nap+"."+honap+"."+year;
        return datum;
    }

}
