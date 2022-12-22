/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachsanpham2;

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
class sp{
    public String ma,ten;
    public int gia,bh;

    public sp(String ma, String ten, int gia, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.gia+" "+this.bh);
    }
}
public class Danhsachsanpham2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<sp> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i  <  t ; i++){
            list.add(new sp(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list,new Comparator<sp>(){
            @Override
            public int compare(sp o1, sp o2) {
                if(o1.getGia()==o2.getGia()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getGia()-o1.getGia();
            }
            
        });
        for(sp i : list){
            i.out();
        }
    }
}
