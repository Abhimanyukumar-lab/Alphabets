package com.sttream.ava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {



    void meth()
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(101);
        arrayList.add(290);
        arrayList.add(105);
        arrayList.add(107);
        arrayList.add(100);

        System.out.println(arrayList);

        System.out.println("using stream api");

      List<Integer> list =arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());

     List list1 =arrayList.stream().filter(i->i==i).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list1);

    }


    public static void main(String[] args) {
     StreamObject streamObject=   new StreamObject();
     streamObject.meth();
    }

}
