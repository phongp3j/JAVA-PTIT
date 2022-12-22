/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HI
 */
class WordSet{
    public String s;
    public Set<String> list;
    public WordSet(String s) throws FileNotFoundException {
        this.s = s;
        list = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().trim().toLowerCase().split("\\s+");
            for(String x : tmp){
                list.add(x);
            }
        }
    }
    public String difference(WordSet s2){
        String res = "";
        for(String x : list){
            if(!s2.list.contains(x)){
                res = res+x+" ";
            }
        }
        return res;
    }
}
public class hieucuahaitaptu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
