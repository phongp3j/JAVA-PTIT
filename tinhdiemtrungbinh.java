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
    public String ma,ten;
    public int d1,d2,d3;
    public double tb;
    public int xep;

    public sv(int i, String ten, int d1, int d2, int d3) {
        if(i < 10){
            this.ma = "SV0"+i;
        }
        else{
            this.ma = "SV"+i;
        }
        String tmp = "";
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for(String x :s){
            tmp = tmp + Character.toUpperCase(x.charAt(0))+x.substring(1)+" ";
        }
        this.ten = tmp;
        this.tb = (double)(d1*3+d2*3+d3*2)/8;
    }

    public void setXep(int xep) {
        this.xep = xep;
    }
    
    public void out(){
        System.out.println(this.ma+" "+this.ten+String.format("%.2f", this.tb)+ " " +this.xep);
    }
}
public class tinhdiemtrungbinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\HI\\Documents\\NetBeansProjects\\codeptit\\src\\main\\java\\com\\mycompany\\codeptit\\test.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new sv(i+1,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<sv>(){
            @Override
            public int compare(sv o1, sv o2) {
                if(o1.tb > o2.tb){
                    return 1;
                }
                return -1;
            }
            
        });
        int tp = 1;
        for(int i = 0 ; i < t ; i++){
            if(list.get(i).tb == list.get(i-1).tb && i > 0){
                list.get(i).setXep(list.get(i-1).xep);
                tp++;
            }
            else{
                list.get(i).setXep(tp);
                tp++;
            }
        }
        for(sv x : list){
            x.out();
        }
    }
}
