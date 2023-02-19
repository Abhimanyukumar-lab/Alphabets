package com.sttream.ava;

public class SwapNumbers {

    void meth3()
    {
        int a=10;
        int b=20;

         a=a+b;
         b=a-b;//10
        a=a-b;


        System.out.println(a);

        System.out.println(b);
    }

    void  reverseNumber()
    {
        //reverse number    12345

        int num=12345;

       int rem, rev=0;


       while (num!=0)
       {
           rem=num%10;
           rev=rev *10 + rem;
           num=num/10;

       }

        System.out.println("Revese of the number "+rev);



    }


    //factorial number find out

    void factorial()
    {
        int num=5;
        int fact=1;

        for (int i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.println("factorial of this" +num +" "+fact);
    }



    public static void main(String[] args) {
        new SwapNumbers().meth3();

        new SwapNumbers().reverseNumber();

        new SwapNumbers().factorial();
    }

}
