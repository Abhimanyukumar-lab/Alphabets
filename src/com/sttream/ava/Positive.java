package com.sttream.ava;

public class Positive {

    void  positiveNegative()
    {
        int number=0;

        if (number>0)
        {
            System.out.println(number+" positive number");
        } else if (number==0) {
            System.out.println(number+ " is zero");
        }else {
            System.out.println(number+" negative number");
        }
    }


    public static void main(String[] args) {

        new Positive().positiveNegative();

    }
}
