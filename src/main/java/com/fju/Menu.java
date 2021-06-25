package com.fju;

public class Menu {
//餐點品項
    String Latte = "莊園拿鐵";
    String Cappuccino = "卡布奇諾";
    String OrangeGreenTea = "鮮橙綠茶";
    String EggBurger = "起司蛋堡";
    String Bagel = "火腿貝果";

//餐點數量
    int l;
    int c;
    int o;
    int e;
    int b;

//餐點價格
    int priceL = 75;
    int priceC = 95;
    int priceO = 50;
    int priceE = 55;
    int priceB = 60;

//選單
    public void list(){
        System.out.println("1. " + Latte + "\t" + priceL + "元");
        System.out.println("2. " + Cappuccino + "\t" + priceC + "元");
        System.out.println("3. " + OrangeGreenTea + "\t" + priceO + "元");
        System.out.println("4. " + EggBurger + "\t" + priceE + "元");
        System.out.println("5. " + Bagel + "\t" + priceB + "元");
    }


}
