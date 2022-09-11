package com.company;

import org.w3c.dom.views.DocumentView;

public class AssignmentOperator {
    public static void main(String[] args) {
//        int a,b;
//        a=10;
//        b=20;
//
//        System.out.println(a++ + a++); //10+11=21
//        System.out.println(a++ + a++);
//        System.out.println(90==90);
//        char aa ='a';
//        int asciiA=aa;
//        System.out.println(asciiA); //97
//        System.out.println(100>100);
//
//
//        int num=100;
//        int num2=num++; //100 promise
//        System.out.println(num);//101
//        System.out.println(num2);//100
//        System.out.println(num>=num2);
//
//
//        //find ASCII in Sinhala
//        char SinhalaA='අ';
//        int asciiSinhalaA=SinhalaA;
//        System.out.println(asciiSinhalaA);


        //task 11

//        System.out.println((2*50+34)>(12*4));
//        System.out.println((12+4)<=(11+5));
//        System.out.println((83*421)==(77*111+999));
//        System.out.println(121!=(110+11));

    //logical operators
        //AND -->

//        System.out.println(true && true );
//        System.out.println(false && true );
//        System.out.println(true && false);
//        System.out.println(false && false);

        boolean a1=true;
        boolean b2=!false;
        //??


        boolean result1=100>=100;
        boolean result2=-90!=90;
        //??




        //OR  ||

//        System.out.println(true || true );
//        System.out.println(false || true );
//        System.out.println(true || false);
//        System.out.println(false || false);



//        System.out.println(true && true ); //true
//        System.out.println(false && true ); //false
//        System.out.println((false && false) || (true && true)); //true
//        System.out.println((false || false) && (true && true));//false
//
//        int a = 55;
//        int b = 70;
//
//        System.out.println(a < 50); // false
//        System.out.println(a < b); //true

        //bitwise operator

        int a,b,c;
        a=10;
        b=5;
        c=20;

        System.out.println((a<b) && (a++<c)); //second part is not will excututed so a ++ will not updated
        System.out.println(a);

        System.out.println(b++<a || a!=b);
        System.out.println(b);
        System.out.println("dadaf");
        System.out.println(c&a); //??


        //Conversion
        String val="102.5";
        double valDoubl=Double.parseDouble(val);
        System.out.println(valDoubl);

        //conversion  string to int  two method
        //1 parseInt or parseDouble
        //2 valueOf()

        System.out.println(Double.valueOf(val));

        //convert to data type  to string


        // 1 DataType.toString()
        int num=22;
        String str=Integer.toString(num);


        // 2 String.valueOf()
        String str1=String.valueOf(num);

        // 3 concatination
        String numStr=""+num;
        System.out.println(numStr+99);





    }


}
