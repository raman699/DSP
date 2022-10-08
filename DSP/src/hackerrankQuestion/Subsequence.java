package hackerrankQuestion;

import java.util.*;
public class Subsequence {

   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String s= sc.next();
        ArrayList<String> al = getSS(s);
        System.out.println(al.size());
        System.out.println(al);
       System.out.println();
       getSS1(s);
       

    }

    public static ArrayList<String> getSS(String str) {

        if (str.length() == 1) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            al.add(str);
            return al;
        }
        char ch = str.charAt(0);

        String ros = str.substring(1);

        ArrayList<String> recRes = getSS(ros);
        ArrayList<String> fresult = new ArrayList<>();
        for (String val : recRes) {
            fresult.add(val);
            fresult.add(ch + val);
        }
        return fresult;
    }
public static ArrayList<String> getSS1(String str) {

        if (str.length() == 1) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            al.add(str);
            System.out.println(str);
            return al;
        }
        char ch = str.charAt(0);

        String ros = str.substring(1);

        ArrayList<String> recRes = getSS1(ros);
        ArrayList<String> fresult = new ArrayList<>();
        for (String val : recRes) {
            fresult.add(val);
            fresult.add(ch + val);
            //System.out.println(val);
            System.out.println(ch+val);
        }
        return fresult;
    }


}