package org.example;

public class Main {
    public static void main(String[] args) {

        //OCTAL

        int q =1144;
        int q8 =0217;

        System.out.println(q8);
        System.out.println(2*Math.pow(8,2) + 1*Math.pow(8,1) + 7*Math.pow(8,0));

        System.out.println(1144/8); //143
        System.out.println(1144%8); //0

        System.out.println(143/8); // 17
        System.out.println(143%8);       // 7

        System.out.println(17/8); //2
        System.out.println(17%8);        //1

        System.out.println(2/8); //0
        System.out.println(2%8);         //2

        int w =978;
        int w8 =01722;
        System.out.println(w8);
        System.out.println(1*Math.pow(8,3) + 7*Math.pow(8,2) + 2*Math.pow(8,1) + 2*Math.pow(8,0));
        System.out.println(w);
        System.out.println(978/8); //122
        System.out.println(978%8);       //2
        System.out.println(122/8); //15
        System.out.println(122%8);      //2
        System.out.println(15/8); //1
        System.out.println(15%8);       //7
        System.out.println(1/8); //0
        System.out.println(1%8);        //1

        int e =12;
        int e8 = 014;
        System.out.println(e);
        System.out.println(e8);
        System.out.println(1*Math.pow(8,2) + 4*Math.pow(8,0) );
        System.out.println(12/8); //1
        System.out.println(12%8);       //4
        System.out.println(1/8);  //0
        System.out.println(1%8);        //1

        //DECIMAL

        int r =12;
        System.out.println(1*Math.pow(10,1) + 0*Math.pow(10,0));

        int t = 978;
        System.out.println(2*Math.pow(10,9) + 1*Math.pow(10,7) + 0*Math.pow(10,8));

        int y = 1144;
        System.out.println(3*Math.pow(10,1) + 2*Math.pow(10,1) + 1*Math.pow(10,4) + 0*Math.pow(10,4));


    }

}