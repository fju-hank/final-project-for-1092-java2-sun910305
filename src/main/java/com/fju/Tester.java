package com.fju;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester extends Menu implements Ways {
    public static void main(String[] args) {
        Tester louisa = new Tester();
        louisa.menu();

    }



//菜單、時間
    public void menu() {
        try {
            System.out.print("Welcome to Louisa");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            System.out.println("Menu:");
            list();
            System.out.println("輸入0為單點模式, 1為套餐模式" + "\n" + "==============================");
            Scanner scanner1 = new Scanner(System.in);
            int order = scanner1.nextInt();
            if (order == 0) {
                normal();
            }if(order == 1){
                set();
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR!");
        }

    }



//單點
        public void normal(){
            try {
                System.out.println("請輸入你想要的餐點的編號：");
                while (true) {
                    Scanner scanner2 = new Scanner(System.in);
                    String items = scanner2.nextLine();


                    switch (items) {
                        case "1":
                            System.out.println("請輸入您想購買幾杯莊園拿鐵：");
                            l = scanner2.nextInt();
                            System.out.println("請問要冰的熱的(I/H)");
                            I = scanner2.next();
                            if (true) {
                                System.out.println("還有什麼需要的嗎(2~5)；輸入88可以前往結帳");
                            } else {
                                System.out.println("還有什麼需要的嗎(2~5)；輸入88可以前往結帳");
                            }
                            continue;
                        case "2":
                            System.out.println("請輸入您想購買幾杯卡布奇諾：");
                            c = scanner2.nextInt();
                            System.out.println("請問要冰的熱的(I/H)");
                            I = scanner2.next();
                            if (true) {
                                System.out.println("還有什麼需要的嗎(1,3,4,5)；輸入88可以前往結帳");
                            } else {
                                System.out.println("還有什麼需要的嗎(1,3,4,5)；輸入88可以前往結帳");
                            }
                            continue;
                        case "3":
                            System.out.println("請輸入您想購買幾杯鮮橙綠茶：");
                            o = scanner2.nextInt();
                            System.out.println("還有什麼需要的嗎(1,2,4,5)；輸入88可以前往結帳");
                            continue;
                        case "4":
                            System.out.println("請輸入您想購買幾個起司蛋堡：");
                            e = scanner2.nextInt();
                            System.out.println("還有什麼需要的嗎(1,2,3,5)；輸入88可以前往結帳");
                            continue;
                        case "5":
                            System.out.println("請輸入您想購買幾份火腿貝果：");
                            b = scanner2.nextInt();
                            System.out.println("還有什麼需要的嗎(1,2,3,4)；輸入88可以前往結帳");
                            continue;
                        case "88":
                            if (true) {
                                int sum = l * priceL + c * priceC + o * priceO + e * priceE + b * priceB;
                                System.out.println("應收:" + sum);
                                int GetMoney = scanner2.nextInt();
                                System.out.println("收款:" + GetMoney);
                                System.out.println("找零:" + (GetMoney - sum));
                                break;

                            }


                    }
                    System.out.println("==============================");
                    menu();

                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR!!!");
            }

        }



//套餐
    @Override
    public void set() {
        try{
            System.out.println("請輸入你想要的套餐的編號(A/B)：");
            while(true){
                Scanner scanner3 = new Scanner(System.in);
                String sets = scanner3.nextLine();

                switch (sets){
                    case "A":
                        System.out.println("請輸入您想購買幾份A套餐：");
                        seta = scanner3.nextInt();
                        System.out.println("請問超值紅茶要冰的熱的(I/H)");
                        I = scanner3.next();
                        if (true) {
                            System.out.println("還有需要B套餐嗎(B)；輸入88可以前往結帳");
                        } else {
                            System.out.println("還有需要B套餐嗎(B)；輸入88可以前往結帳");
                        }
                        continue;
                    case "B":
                        System.out.println("請輸入您想購買幾份B套餐：");
                        setb = scanner3.nextInt();
                        System.out.println("還有需要A套餐嗎(A)；輸入88可以前往結帳");
                        continue;
                    case "88":
                        if (true) {
                            int sum = seta * priceSetA + setb * priceSetB;
                            System.out.println("應收:" + sum);
                            int GetMoney = scanner3.nextInt();
                            System.out.println("收款:" + GetMoney);
                            System.out.println("找零:" + (GetMoney - sum));
                            break;

                        }
                }System.out.println("==============================");
                menu();
            }



        }catch (InputMismatchException e){
            System.out.println("ERROR!!!");
        }

    }





}
