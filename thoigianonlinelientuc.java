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
class sv{
    public String ten;
    public Date bd,kt;
    public long onl;

    public sv(String ten, String bd, String kt) throws ParseException {
        this.ten = ten;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.bd = sdf.parse(bd);
        this.kt = sdf.parse(kt);
        this.onl = ChronoUnit.MINUTES.between(this.bd.toInstant(), this.kt.toInstant());
    }

    public String getTen() {
        return ten;
    }

    public long getOnl() {
        return onl;
    }
    
    public void out(){
        System.out.println(this.ten+ " "+this.onl);
    }
    
}
public class thoigianonlinelientuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            list.add(new sv(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list,new Comparator<sv>(){
            @Override
            public int compare(sv o1, sv o2) {
                if(o1.getOnl() == o2.getOnl()){
                    return o1.getTen().compareTo(o2.getTen());
                }
                return (int)(o2.getOnl()-o1.getOnl());
            }
            
        });
        for(sv i : list){
            i.out();
        }
    }
}
