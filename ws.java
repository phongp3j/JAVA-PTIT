/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HI
 */
class WordSet{
    public Set<String> list;

    public WordSet(String s) {
        list = new TreeSet<>();
        String[] x =  s.trim().toLowerCase().split("\\s+");
        for(String i : x){
            list.add(i);
        }
    }
    public String intersection(WordSet s1){
        String res ="";
        for(String x  : list){
            if(s1.list.contains(x)){
                res= res + x +" ";
            }
        }
        return res;
    }
    public String union(WordSet s1){
        String res ="";
        Set<String> list1 = new TreeSet<>();
        for(String x : list){
            list1.add(x);
        }
        for(String x : s1.list){
            list1.add(x);
        }
        for(String x : list1){
            res= res + x +" ";
        }
        return res;
    }
    
    
}
public class ws {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
