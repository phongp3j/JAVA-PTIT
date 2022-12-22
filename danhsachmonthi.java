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
class mon{
    public String ma,mon,hinhthuc;

    public mon(String ma, String mon, String hinhthuc) {
        this.ma = ma;
        this.mon = mon;
        this.hinhthuc = hinhthuc;
    }
    
    public void out(){
        System.out.println(this.ma+" "+this.mon+" "+this.hinhthuc);
    }
}
public class danhsachmonthi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<mon> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new mon(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list,new Comparator<mon>(){
            @Override
            public int compare(mon o1, mon o2) {
                return o1.ma.compareTo(o2.ma);
            }
            
        });
        for(mon x : list){
            x.out();
        }
    }
}
