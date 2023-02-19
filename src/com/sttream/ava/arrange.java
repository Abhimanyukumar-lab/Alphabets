package com.sttream.ava;

import java.util.ArrayList;
import java.util.List;

public class arrange {


    void meth()
    {
        List<String> list=new ArrayList<>();

        list.add("abhimanyu");
        list.add("vikash");
        list.add("sanu");
        list.add("ankit");
        list.add("bnkesh");
        list.add("ankesh");
        list.add("ankesh");
        list.add("bnkesh");
        list.add("ankesh");

        System.out.println(list);
        list.stream().sorted().filter((s)->s.startsWith("a")).forEach(System.out::println);

        list.stream().sorted().filter((s)->s.startsWith("b")).forEach(System.out::println);




    }


    public static void main(String[] args) {
        new arrange().meth();

    }
}
