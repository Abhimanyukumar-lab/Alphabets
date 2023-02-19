package com.sttream.ava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VowelPrese {




    void meth2()
    {
        //String vowels={a,e,i,o,u};

        List<String> list=new ArrayList<>();

        list.add("abhimanyu");
        list.add("vikash");
        list.add("sanu");

        System.out.println(list);



//        String str="abhimanyu";
//        String str1="TV";

    }

    boolean stringVowels( String input)
    {
        return  input.toLowerCase().matches(".*[aeiou].*");
    }





    public static void main(String[] args) {

new  VowelPrese().meth2();

new VowelPrese().stringVowels("Abhimanyu");
    }
}
