package com.abhi;

public class reverseString {
    public static void main(String[] args){
        String str="My name is Abhishek";
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString()+" ";
        }
        return reverseWord.trim();
    }
}
