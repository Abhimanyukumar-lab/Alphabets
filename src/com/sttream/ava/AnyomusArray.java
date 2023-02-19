package com.sttream.ava;

public class AnyomusArray {




    static  void  sum(int no[])
    {
        int total=0;
        for (int i:no) {

            total=total+i;
            System.out.println("sum is "+total);
        }

    }

    public static void main(String[] args) {
     AnyomusArray.sum(new int[] {10,20,30});
    }
}
