package com.GoogleClassRoom;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Product {
    /*
    Create a Product Class
    name;
    availableCount;
    price;
    returnedCount;
    Create below methods
            sellProduct
    returnProduct
    exchangeProduct - take an old product and exchange for a new one.
            applyDiscount
            checkProductInStock
    orderProduct

     */
    public Scanner scanner=new Scanner(System.in);
    public String name;
    public int availableCount;
    public double price;
    public int returnedCount;

    //default constructor
    public Product(){

    }


    //constructor
    public Product(String name, int availableCount, double price, int returnedCount) {
        this.name = name;
        this.availableCount = availableCount;
        this.price = price;
        this.returnedCount = returnedCount;
    }

    void sellProduct() {
        System.out.println("========== SELL ==============");
        System.out.println("Enter your sell amount");
        int sellAmount=scanner.nextInt();
        if(sellAmount<=availableCount)
        {
            System.out.println("Total price is  $"+ sellAmount*price);
            //discount
            System.out.println("Do you want to add discount? YES/NO ");
            String YesOrNo=scanner.next();
            if(YesOrNo.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter your discount Percentage ");
                int discountPercentage=scanner.nextInt();
                double afterDiscount=applyDiscount(price, discountPercentage);
                System.out.println("Your payment after the discount is $"+afterDiscount);
            }else
            {
                System.out.println("Discount not applicable for this sale");
                System.out.println("Your payment  is $"+sellAmount*price);

            }
            System.out.println("Selling Completed ");
            //update the stock after one sale
            availableCount=availableCount-sellAmount;
            System.out.println("Current stock updated after selling current stock :" +availableCount );


        }else {
            System.out.println("out of stock !");
        }
    }
   public  void returnProduct(){
       System.out.println("========== RETURN ==============");
        //update returned  count //I assume that products added to selling stock
       System.out.println("Enter return amount ");
       int returnCount=scanner.nextInt();
       availableCount=availableCount+returnCount;
       System.out.println("Returned "+returnCount +"to the stock and new stock is "+availableCount);
    }

    public void exchangedProduct() //take an old product and exchange for a new one.
    {
        System.out.println("========== EXCHANGE ==============");
        System.out.println("Enter  amount of old product");
        int oldProduct=scanner.nextInt();
        int StockAfterOld=availableCount-oldProduct;
        System.out.println("Removed " + oldProduct +"from the stock and new stock is "+StockAfterOld);

        int newProduct=scanner.nextInt();
        int StockAfterNew=availableCount+oldProduct;
        System.out.println("Added " + newProduct +"from the stock and new stock is "+StockAfterNew);

        checkProductInStock();


    }

    public double applyDiscount(double actualPrice,int discountPercentage)
    {
        double discountPrice=actualPrice-(actualPrice*(discountPercentage/100));
        return discountPrice;
    }


    public void checkProductInStock(){
        System.out.println("========== AVAILABLE PRODUCT ==============");
        if(availableCount!=0) {
            System.out.println("Available product amount  is " + availableCount);
        }else
        {
            System.out.println(name+" out of stock");
        }
        }


    public void orderProduct(){
        System.out.println("========== ORDER PRODUCT ==============");
        System.out.println("Enter the amount of oder count ");
        int orderAmount=scanner.nextInt();

        availableCount+=orderAmount;
        System.out.println("Product "+ name +"has increased  new available count is "+availableCount);
    }


    }


