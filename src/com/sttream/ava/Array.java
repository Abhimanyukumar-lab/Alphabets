package com.sttream.ava;

import java.util.OptionalInt;

public class Array {
    private OptionalInt list;

   void array()
  {
      int array[]={0,0,1,0,1,1,0};

      System.out.print(array[0] + " ");

      if (array[0] == 0) {
          System.out.println( array[0]);;
      }

      System.out.print(array[1] + " ");

      if (array[1] == 0) {
          System.out.println(array[1]);
      }


      System.out.print(array[3] + " ");

      if (array[3] == 0) {
          System.out.println(array[3]);;
      }



      System.out.print(array[6] + " ");

      if (array[6] == 0) {
          System.out.println( array[6]);;
      }


      System.out.print(array[2] + " ");

      if (array[2] == 0) {
          System.out.println(array[2]);;
      }



      System.out.print(array[4] + " ");

      if (array[4] == 0) {
          System.out.println(array[4]);;
      }

      System.out.print(array[5] + " ");

      if (array[5] == 0) {
          System.out.println(   array[5]);;
      }



      System.out.println();




  }
  public static void main(String[] args) {

        //System.out.println("hello mam");
        new  Array().array();


    }


}
