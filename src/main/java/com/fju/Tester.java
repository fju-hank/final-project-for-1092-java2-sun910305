package com.fju;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester extends Menu implements Ways{
    public static void main(String[] args) {
        Tester louisa = new Tester();
        louisa.menu();

    }




    public void menu() {
        try {
            System.out.print("Welcome to Louisa  ");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));

            show();
            System.out.println("輸入0為單點模式" + "\n" + "==============================");
            Scanner scanner = new Scanner(System.in);
            int order = scanner.nextInt();
            if (order == 0) {
                normal();
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR!");
        }
    }





    public void normal(){
        try{
            System.out.println("請輸入你想要的餐點的編號：");
            while (true){
                Scanner scanner2 = new Scanner(System.in);
                String items = scanner2.nextLine();
                switch (items){
                    case "1" :
                        System.out.println("請輸入您想購買幾杯拿鐵：");
                        l = scanner2.nextInt();
                        System.out.println("還有什麼需要的嗎；輸入88可以前往結帳");
                        continue;
                    case "2" :
                        System.out.println("請輸入您想購買幾杯卡布奇諾：");
                        c = scanner2.nextInt();
                        System.out.println("還有什麼需要的嗎；輸入88可以前往結帳");
                        continue;
                    case "3" :
                        System.out.println("請輸入您想購買幾杯特調咖啡：");
                        s = scanner2.nextInt();
                        System.out.println("還有什麼需要的嗎；輸入88可以前往結帳");
                        continue;
                    case "4" :
                        System.out.println("請輸入您想購買幾個瑪芬堡：");
                        e = scanner2.nextInt();
                        System.out.println("還有什麼需要的嗎；輸入88可以前往結帳");
                        continue;
                    case "5" :
                        System.out.println("請輸入您想購買幾份磚壓三明治：");
                        w = scanner2.nextInt();
                        System.out.println("還有什麼需要的嗎；輸入88可以前往結帳");
                        continue;
                    case "88" :
                        if(true){

                        }



                }



            }


        }catch (InputMismatchException e){
            System.out.println("ERROR!!!");
        }

    }

}
