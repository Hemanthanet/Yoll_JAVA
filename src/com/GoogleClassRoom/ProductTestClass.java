package com.GoogleClassRoom;

public class ProductTestClass {
    public static void main(String[] args) {

       Product Samsung=new Product("Samsung S2", 349, 890.98, 0);
       Product Apple =new Product("Apple 14", 250, 1450.99, 0);

       //for the Samsung object

        Samsung.sellProduct();
        Samsung.checkProductInStock();
        Samsung.returnProduct();
        Samsung.checkProductInStock();
        Samsung.sellProduct();
        Samsung.exchangedProduct();





    }

}
