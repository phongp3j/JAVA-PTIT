/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HI
 */
class hang{
    public String ten;
    public double gia,soluong,giaban;

    public hang(String ten, double gia, double soluong) {
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        double thue = gia*soluong;
        double vanchuyen = gia * soluong;
        if(ten.charAt(0) == 'T'){
            if(ten.charAt(ten.length()-1) == 'C'){
                thue = thue * 0.29 * 0.95;
                vanchuyen = vanchuyen * 0.04;
            }
            else{
                thue = thue * 0.29;
                vanchuyen = vanchuyen * 0.04;
            }
        }
        else if(ten.charAt(0) == 'C'){
            if(ten.charAt(ten.length()-1) == 'C'){
                thue = thue * 0.1 * 0.95;
                vanchuyen = vanchuyen * 0.03;
            }
            else{
                thue = thue * 0.1;
                vanchuyen = vanchuyen * 0.03;
            }
        }
        else if(ten.charAt(0) == 'D'){
            if(ten.charAt(ten.length()-1) == 'C'){
                thue = thue * 0.08 * 0.95;
                vanchuyen = vanchuyen * 0.025;
            }
            else{
                thue = thue * 0.08;
                vanchuyen = vanchuyen * 0.025;
            }
        }
        else{
            if(ten.charAt(ten.length()-1) == 'C'){
                thue = thue * 0.02 * 0.95;
                vanchuyen = vanchuyen * 0.005;
            }
            else{
                thue = thue * 0.02;
                vanchuyen = vanchuyen * 0.005;
            }
        }
        this.giaban = (gia*soluong + thue + vanchuyen)*1.2/soluong;
    }
    public void out(){
        System.out.println(this.ten+" "+String.format("%.2f", giaban));
    }
    
}
public class tinhtoangiaban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new hang(sc.next(),sc.nextDouble(),sc.nextDouble()));
            sc.nextLine();
        }
        for(hang i : list){
            i.out();
        }
    }
}
