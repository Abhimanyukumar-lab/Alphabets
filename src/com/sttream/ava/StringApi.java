package com.sttream.ava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringApi {



    public  void meth2()
    {
        ArrayList<String>  as=new ArrayList<>();
        as.add("abhimanyu");
        as.add("ravi");
        as.add("aanand");
        as.add("bitu");
        as.add("kajol");
        as.add("samantha");
        as.add("amisha");

        System.out.println(as);

        //using stream api

     List<String> list =as.stream().filter(s->s.length()<=9).collect(Collectors.toList());

     long i=list.stream().count();

        System.out.println(i);

    }


      void  empSalary()
      {
          ArrayList<Integer> al=new ArrayList<>();
          al.add(50000);
          al.add(60000);
          al.add(70000);
          al.add(80000);
          al.add(90000);
          al.add(100000);

          System.out.println("Before update "+al);

     List<Integer>    h =al.stream().map(i->i+500).collect(Collectors.toList());

          System.out.println("updatted salary");
          System.out.println(h);

      }





    public static void main(String[] args) {
     StringApi stringApi=   new  StringApi();

     stringApi.meth2();
     stringApi.empSalary();



    }
}
