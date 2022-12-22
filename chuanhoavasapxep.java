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
public class chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] l = s.split("\\s+");
            String tmp = "";
            for(String x : l){
                tmp = tmp + Character.toUpperCase(x.charAt(0))+x.substring(1)+" ";
            }
            list.add(tmp);
        }
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split("\\s+");
                String[] s2 = o2.split("\\s+");
                if(s1[s1.length - 1].compareTo(s2[s2.length-1]) == 0){
                    if(s1[0].compareTo(s2[0]) == 0){
                        return o1.compareTo(o2);
                    }
                    return s1[0].compareTo(s2[0]);
                }
                return s1[s1.length - 1].compareTo(s2[s2.length-1]);
            }
        
    });
        for(String x : list){
            System.out.println(x);
        }
    }
}
