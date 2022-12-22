/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loaiphong;

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
class phong{
    public String ma,ten;
    public int gia;
    public float phi;
    public phong(String ma, String ten, int gia, float phi) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.phi = phi;
    }

    public String getTen() {
        return ten;
    }
    
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.gia+" "+this.phi);
    }
}
public class Loaiphong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("PHONG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<phong> list = new ArrayList<>();
        for(int i = 0 ; i  <  t ; i++){
            list.add(new phong(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<phong>(){
            @Override
            public int compare(phong o1, phong o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        for(phong i : list){
            i.out();
        }
    }
}
