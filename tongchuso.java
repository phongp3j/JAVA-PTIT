/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HI
 */
public class tongchuso {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) sc.readObject();
        for(String i : list){
            String res = "";
            int sum =0;
            for(int j = 0 ; j < i.length() ; j++){
                if(i.charAt(j) >= '0' && i.charAt(j) <='9'){
                    if(res.equals("") && i.charAt(j) == '0'){
                        continue;
                    }
                    else{
                        res =  res+ (i.charAt(j));
                        sum = sum+Integer.parseInt(Character.toString(i.charAt(j)));
                    }
                }
            }
            System.out.println(res+" "+sum);
        }
    }
}
