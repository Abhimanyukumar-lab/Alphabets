package com.sttream.ava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {


    public static void main(String[] args) {

        List<Integer> list1=List.of(2,4,7,8,9,10,78,90,55,45,87);

//        System.out.println(list1);
//
//        for (Integer i:list1) {
//
//            if (i%2==0)
//            {
//                System.out.println(i);
//
//            }
//
//        }


        //using stream

      Stream<Integer>  stream=list1.stream();
     List<Integer>  newList =stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        //next methods

       List<Integer> nList =list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(nList);

       List<Integer> noIntegers =list1.stream().filter(i->i>=50).collect(Collectors.toList());

        System.out.println(noIntegers);

        Iterator<Integer> i2=noIntegers.iterator();
        while (i2.hasNext())
        {
            System.out.println(i2.next());
        }


        List<Integer> ll=new ArrayList<>();



    }



}
