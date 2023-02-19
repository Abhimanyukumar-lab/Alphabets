package com.sttream.ava;

public class GreatestNumber {



 void  greaterNumber()
    {
        //to find the greatest number

        int a=-200,b=-8;

        if (a==b)
        {
            System.out.println(a + " both number equal");

        } else if (a>b) {
            System.out.println(a + " is greater number");
        } else {

            System.out.println(b +" is greater number");

        }
    }

    public static void main(String[] args) {

        new GreatestNumber().greaterNumber();


    }
}
