package com.GoogleClassRoom;

public class For2While {

    public static void main(String[] args) {
        int count = 0;
        for (int x = 10; x <= 20; x += 2)
        {
            System.out.println(x);
            for(int y = x; y >= 0; y -= 1)
            {
                count = count + 1;
                System.out.println(x);
            }
        }
//
// with  while  loop

        int x=10;
        int count1=0;

        while(x<=20){
            System.out.println(x);
            int y=x;
            while (y>=0)
            {
                y=y-1;
                count1=count1+1;
                System.out.println(x);
            }
            x += 2;
        }

//        What is the final value of count? 96
       // System.out.println("count is "+count);

    }
}
