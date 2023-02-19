package com.sttream.ava;

public class StringName {


    void  meth1()
    {
        String str="ABAc";
        String  stp=str;

     int length= str.length()-1;
        String rev="";


        for (int i=length;i>=0;i--)

        {
           rev=rev + str.charAt(i);
        }
        System.out.println(rev);

        if (stp.equals(rev))
        {
            System.out.println(str +" " + "is palidrome");
        }
        else {
            System.out.println(str +"" + "is not palidrome");
        }


    }





    public static void main(String[] args) {
  new StringName().meth1();
    }


}
