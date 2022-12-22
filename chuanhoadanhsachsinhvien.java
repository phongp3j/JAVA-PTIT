/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HI
 */
class sv{
    public String ma,ten,lop,ngaysinh;
    public float diem;

    public sv(int i, String ten, String lop, String ngaysinh, float diem) {
        if(i < 10){
            this.ma = "B20DCCN00"+i;
        }
        else if(i<100){
            this.ma = "B20DCCN0"+i;
        }
        else{
            this.ma = "B20DCCN"+i;
        }
        String tmp = "";
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for(String x : s){
            tmp = tmp + Character.toUpperCase(x.charAt(0)) + x.substring(1)+" ";
        }
        this.ten = tmp;
        this.lop = lop;
        if(ngaysinh.charAt(2) != '/'){
            ngaysinh = '0'+ngaysinh;
        }
        if(ngaysinh.charAt(5) != '/'){
            ngaysinh = ngaysinh.substring(0,3) + "0"+ngaysinh.substring(3);
        }
        this.ngaysinh = ngaysinh;
        this.diem = diem;
    }
    
    public void out(){
        System.out.println(this.ma+" "+this.ten+this.lop+" "+this.ngaysinh+" "+String.format("%.2f", this.diem));
    }
}
public class chuanhoadanhsachsinhvien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt((sc.nextLine()));
        ArrayList<sv> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new sv(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        for(sv i : list){
            i.out();
        }
    }
}
