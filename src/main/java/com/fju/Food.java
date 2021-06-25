package com.fju;

public class Food {
    String Latte = "拿鐵";
    String Cappuccino = "卡布奇諾";
    String Special = "特調";
    String Muffin = "瑪芬堡";
    String Wrapanini = "磚壓三明治";

    int l;
    int c;
    int s;
    int m;
    int w;

    int priceL = 75;
    int priceC = 95;
    int priceS = 70;
    int priceM = 55;
    int priceW = 50;

    public void show(){
        System.out.println("拿鐵(M) 75元");
        System.out.println("卡布奇諾(M) 95元");
        System.out.println("特條(M) 70元");
        System.out.println("瑪芬堡(M) 55元");
        System.out.println("磚壓三明治(M) 50元");
    }


}
