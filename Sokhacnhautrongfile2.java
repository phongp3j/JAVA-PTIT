/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sokhacnhautrongfile2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Sokhacnhautrongfile2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.in"));
        int[] list = new int[1001];
        for(int i = 0 ; i < 100001 ; i++){
            list[dt.readInt()]++;
        }
        for(int i = 0 ; i< 1001 ; i++){
            if(list[i]!=0){
                System.out.println(i+" "+list[i]);
            }
        }
    }
}
