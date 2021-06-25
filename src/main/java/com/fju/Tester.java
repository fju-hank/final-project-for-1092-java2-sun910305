package com.fju;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester extends Food implements Ways{
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
            System.out.println("輸入1為單點模式" + "\n" + "----------------------------------------------");
            Scanner scanner2 = new Scanner(System.in);
            int order = scanner2.nextInt();
            if (order == 1) {
                normal();
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR!");
        }
    }



    public void normal(){

    }

}
