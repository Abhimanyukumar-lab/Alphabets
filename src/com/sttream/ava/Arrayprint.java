package com.sttream.ava;

public class Arrayprint {



    void printArray()
    {
        int array[]={0,0,1,0,1,0,1};

        for (int i=0;i<array.length;i++)
        {
            System.out.println("index of array "+i +"= "+array[i]);
        }


        //to print array while llop

        System.out.println("to print array while loop");

        int i=0;
        while (i<array.length)
        {
            System.out.print(array[i]+ " ");
            i++;
        }
        System.out.println();

        //to print array do while loop

        System.out.println("to print array do while loop");
int st=0;
        do {
            System.out.print(array[st]+ " ");
            st++;
        }while (st<array.length);

        System.out.println();

        //to revrse of array
        System.out.println("===============Revesre of the array======");

        for (int s=array.length-1;i>=0;i--)
        {
            System.out.print(array[s]+" ");
        }
        System.out.println();


        System.out.println("=============sort array in for each methods=============");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println();





    }






    public static void main(String[] args) {
new Arrayprint().printArray();
    }
}
