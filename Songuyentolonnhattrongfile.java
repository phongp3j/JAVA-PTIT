/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.songuyentolonnhattrongfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HI
 */
public class Songuyentolonnhattrongfile {
    static int[] nt = new int[1000001];
    public static void ngt(){
        for(int i = 0 ; i < 1000001 ; i++){
            nt[i] =1;
        }
        nt[0] = 0;
        nt[1] = 0;
        for(int i = 2 ; i <= 1000 ; i++){
            if(nt[i]==1){
                for(int j = i*i ; j < 1000001 ; j+=i){
                    nt[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ngt();
        ObjectInputStream sc =new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[1000001];
        int dem = 0;
        for(Integer x : list){
            a[x]+=nt[x];
        }
        for(int i = 1000000; i >=2 ; i--){
            if(a[i]!=0 ){
                System.out.println(i+" "+a[i]);
                dem++;
                if(dem==10){
                    break;
                }
            }
        }
        sc.close();
    }
}
