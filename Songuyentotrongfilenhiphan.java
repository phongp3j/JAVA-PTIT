/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.songuyentotrongfilenhiphan;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HI
 */
public class Songuyentotrongfilenhiphan {
    public static int check(int x){
        if(x < 2){
            return 0;
        }
        else{
            for(int i = 2; i <= Math.sqrt(x) ; i++){
                if(x%i == 0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream dt = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) dt.readObject();
        int[] a = new int[10000];
        for(Integer i : list){
            if(check(i) == 1){
                a[i]++;
            }
        }
        for(int i = 0 ; i < 10000; i++){
            if(a[i]!=0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
