/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.capsonguyentotrongfile1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HI
 */
public class Capsonguyentotrongfile1 {
    static int[] a = new int[1000001];
    public static void ngt(){
        for(int i = 0 ; i < 1000001 ; i++){
            a[i] = 1;
        }
        a[0]= a[1] = 0;
        for(int i = 2 ; i <= 1000 ; i++){
            if(a[i]==1){
                for(int j = i*i ; j < 1000001; j+=i){
                    a[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ngt();
        ObjectInputStream o1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream( new FileInputStream("DATA2.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> l2 = (ArrayList<Integer>) o2.readObject();
        int[] a1 = new int[1000001];
        int[] a2 = new int[1000001];
        for(Integer x : l1){
            if(a[x]==1){
                a1[x] = 1;
            }
        }
        for(Integer x : l2){
            if(a[x]==1){
                a2[x]=1;
            }
        }
        for(int i = 2 ; i < 1000001 ; i++){
            if(a2[1000000-i]==1 && a1[i] == 1 && i < 1000000-i){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
}
