/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HI
 */
class hang{
    public String ma,ten,nhom;
    public double mua,ban,loi;

    public hang(int i, String ten, String nhom, double mua, double ban) {
        if(i<10){
            this.ma = "MH0"+i;
        }
        else{
            this.ma = "MH"+i;
        }
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loi = ban - mua;
    }

    public double getLoi() {
        return loi;
    }

    public String getMa() {
        return ma;
    }
    
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.nhom+" "+String.format("%.2f", this.loi));
    }
}
public class sapxepmathang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<hang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < t ; i++){
            list.add(new hang(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list,new Comparator<hang>(){
            @Override
            public int compare(hang o1, hang o2) {
                if(o1.getLoi()==o2.getLoi()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                else if(o1.getLoi() > o2.getLoi()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            
        });
        for(hang i : list){
            i.out();
        }
    }
}
