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
class sv{
    public String ma,ten,dt,email;

    public sv(String ma, String ten, String dt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.dt = dt;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.dt+" "+this.email);
    }
}
public class sapxepdanhsachsinhvien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt((sc.nextLine()));
        ArrayList<sv> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, new Comparator<sv>(){
            @Override
            public int compare(sv o1, sv o2) {
                String[] s1 = o1.getTen().split("\\s+");
                String[] s2 = o2.getTen().split("\\s+");
                String first1 = s1[0];
                String last1 = s1[s1.length - 1];
                String first2 = s2[0];
                String last2 = s2[s2.length - 1];
                if(last2.equals(last1)){
                    if(first1.equals(first2)){
                        if(o1.getTen().equals(o2.getTen())){
                            return o1.getMa().compareTo(o2.getMa());
                        }
                        return o1.getTen().compareTo(o2.getTen());
                    }
                    return first1.compareTo(first2);
                }
                return last1.compareTo(last2);
            }
            
        });
        for(sv i : list){
            i.out();
        }
    }
}
