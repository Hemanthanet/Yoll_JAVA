package com.company.module04_loops;

public class print2DArray {
    public static void main(String[] args) {

        String names[][]={
                {"Hematha","Sisira","Sanka","Chanaka","Nayoma","Samantha","Duminda"},
                {"Nimali","Donika","Yamini","Nadeesha","adf","adsfa","adf"},
                {"yiuyi","yuiy","Yaminyuii","Nad675eesha","ad567f","ad567sfa","a567df"}
        };
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++)
            {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

    }
}
