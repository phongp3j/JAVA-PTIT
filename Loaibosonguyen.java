/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loaibosonguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Loaibosonguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception x){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String x : list){
            System.out.print(x+" ");
        }
    }
}
