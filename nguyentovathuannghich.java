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
public class nguyentovathuannghich {

    static int[] a = new int[10001];

    public static void nt() {
        for (int i = 0; i < 10001; i++) {
            a[i] = 1;
        }
        a[0] = a[1] = 0;
        for (int i = 2; i < 100; i++) {
            if (a[i] == 1) {
                for (int j = i * i; j < 10001; j += i) {
                    a[j] = 0;
                }
            }
        }
    }

    public static int tn(int x) {
        String tmp = Integer.toString(x);
        for(int i = 0 ; i <= tmp.length()/2 ; i++){
            if(tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        nt();
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        int[] res1 = new int[10001];
        int[] res2 = new int[10001];
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        for (int i : list1) {
            if (a[i] == 1 && tn(a[i]) == 1) {
                res1[i]++;
            }
        }
        for (int i : list2) {
            if (a[i] == 1 && tn(a[i]) == 1) {
                res2[i]++;
            }
        }
        for (int i = 0; i < 10001; i++) {
            if (tn(i) == 1 && a[i] == 1) {
                if (res1[i] != 0 && res2[i] != 0) {
                    System.out.println(i + " " + res1[i] + " " + res2[i]);
                }
            }
        }
    }
}
