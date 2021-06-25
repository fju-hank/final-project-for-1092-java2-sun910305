package com.fju;

public class Menu {
    String Latte = "拿鐵";
    String Cappuccino = "卡布奇諾";
    String Special = "特調";
    String EggBurger = "瑪芬堡";
    String Wrapanini = "磚壓三明治";

    int l;
    int c;
    int s;
    int e;
    int w;

    int priceL = 75;
    int priceC = 95;
    int priceS = 70;
    int priceE = 55;
    int priceW = 50;

    public void show(){
        System.out.println("1.拿鐵       75元");
        System.out.println("2.卡布       95元");
        System.out.println("3.特調       70元");
        System.out.println("4.蛋堡       45元");
        System.out.println("5.磚壓三明治  50元");



    }


}
