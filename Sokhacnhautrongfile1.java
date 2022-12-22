/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sokhacnhautrongfile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Sokhacnhautrongfile1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] list = new int[1001];
        for(int i = 0 ; i < 1001; i++){
            list[i] = 0;
        }
        while(sc.hasNext()){
            list[Integer.parseInt(sc.next())]++;
        }
        for(int i = 0 ; i < 1001 ; i++){
            if(list[i]!=0){
                System.out.println(i+" "+list[i]);
            }
        }
    }
}
