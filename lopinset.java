/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HI
 */
class IntSet{
    Set<Integer> s ;

    public IntSet(int[] a) {
        s = new TreeSet<>();
        for(int i : a){
            s.add(i);
        }
    }
    
    public IntSet union(IntSet s2){
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : s){
            res.add(x);
        }
        for(int x : s2.s){
            res.add(x);
        }
        int[] tmp = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i++){
            tmp[i] = res.get(i);
        }
        IntSet l = new IntSet(tmp);
        return l;
    }

    @Override
    public String toString() {
        String res = "";
        for(int x : s){
            res=res+x+" ";
        }
        return res;
    }
    
}
public class lopinset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
