/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HI
 */
class kh{
    public String ma,ten,phong;
    public Date den,di;
    public long ngay;

    public kh(int i, String ten, String phong, String den, String di) throws ParseException {
        if(i < 10){
            this.ma= "KH0"+i;
        }
        else{
            this.ma = "KH"+i;
        }
        this.ten = ten;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.den = sdf.parse(den);
        this.di = sdf.parse(di);
        this.ngay =  ChronoUnit.DAYS.between(this.den.toInstant(), this.di.toInstant());
    }

    public long getNgay() {
        return ngay;
    }
    public void out(){
        System.out.println(this.ma+" "+this.ten+" "+this.phong+" "+this.ngay);
    }
}
public class danhsachluutru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<kh> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < t ; i++){
            list.add(new kh(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, new Comparator<kh>(){
            @Override
            public int compare(kh o1, kh o2) {
                return (int)(o2.getNgay() - o1.getNgay());
            }
            
        });
        for(kh i : list){
            i.out();
        }
    }
}
