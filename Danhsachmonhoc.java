/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachmonhoc;

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
    public String ma,ten;
    public int so;

    public mon(String ma, String ten, int so) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.so);
    }

    public String getTen() {
        return ten;
    }
    
}
public class Danhsachmonhoc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<mon> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < t ; i++){
            list.add(new mon(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<mon>() {
            @Override
            public int compare(mon o1, mon o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for(mon i : list){
            i.out();
        }
    }
}
