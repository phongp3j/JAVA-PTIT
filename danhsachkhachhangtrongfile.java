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
class kh{
    public String ma,ten,gioitinh,ngaysinh,diachi;

    public kh(int i, String ten, String gioitinh, String ngaysinh, String diachi) {
        if(i < 10){
            this.ma = "KH00"+i;
        }
        else if(i<100){
            this.ma = "KH0"+i;
        }
        else{
            this.ma = "KH"+i;
        }
        String tmp = "";
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for(String x : s){
            tmp = tmp + Character.toUpperCase(x.charAt(0)) + x.substring(1)+" ";
        }
        this.ten = tmp;
        this.gioitinh = gioitinh;
        if(ngaysinh.charAt(2) != '/'){
            ngaysinh = '0'+ngaysinh;
        }
        if(ngaysinh.charAt(5) != '/'){
            ngaysinh = ngaysinh.substring(0,3) + "0"+ngaysinh.substring(3);
        }
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public void out(){
        System.out.println(this.ma+" "+this.ten+this.gioitinh+" "+this.diachi+" "+this.ngaysinh);
    }
}
public class danhsachkhachhangtrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt((sc.nextLine()));
        ArrayList<kh> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new kh(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list,new Comparator<kh>(){
            @Override
            public int compare(kh o1, kh o2) {
                String[] s1 = o1.ngaysinh.trim().split("/");
                String[] s2 = o2.ngaysinh.trim().split("/");
                if(s1[2].compareTo(s2[2]) == 0){
                    if(s1[1].equals(s2[1])){
                        return s1[0].compareTo(s2[0]);
                    }
                    return s1[1].compareTo(s2[1]);
                }
                return s1[2].compareTo(s2[2]);
            }
            
        });
        for(kh i : list){
            i.out();
        }
    }
}
