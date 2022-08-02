package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }

    static boolean palindrome(int i){
        if(i < 0){
            return false;
        }

        String i_string = String.valueOf(i);
        for(int j = 0, k = i_string.length(); j < Math.floor(i_string.length()/2); j++, k--){
            if(i_string.charAt(j) != i_string.charAt(k -1)){
                return false;
            }
        }
        return true;
    }
}