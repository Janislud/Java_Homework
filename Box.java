package org.example;

public class Box {

    int length;

    int high;

    int width;

    public Box(int length,int high,int width){

        this.length = length;
        this.high = high;
        this.width = width;

        System.out.println(length);
        System.out.println(high);
        System.out.println(width);
    }

    public Box (int length,int high){
        this.length = length;
        this.high = high;
        width = 100;

        System.out.println(length);
        System.out.println(high);
        System.out.println(width);

    }

    public Box (int length){
        this.length = length;
        high = high;
        width = 100;

        System.out.println(length);
        System.out.println(high);
        System.out.println(width);
    }

    public Box (){
        length = 33;
        high = 33;
        width = 33;

        System.out.println(length);
        System.out.println(high);
        System.out.println(width);


    }













}
