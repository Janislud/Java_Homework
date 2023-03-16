package org.example;

public class Box {

    int length;

    int high;

    int width;

    public Box(int length,int high,int width){

        this.length = length;
        this.high = high;
        this.width = width;
        print();
    }

    public Box (int length,int high){
        this.length = length;
        this.high = high;
        width = 100;
        print();
    }

    public Box (int length){
        this.length = length;
        high = high;
        width = 100;
        print();
    }

    public Box (){
        length = 33;
        high = 33;
        width = 33;
        print();
    }

    public void print() {
        System.out.println("length=" + length + ", high=" + high + ", width=" + width);
    }













}
