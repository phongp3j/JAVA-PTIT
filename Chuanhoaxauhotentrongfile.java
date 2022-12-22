/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.chuanhoaxauhotentrongfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Chuanhoaxauhotentrongfile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            s=s.trim();
            String[] list = s.split("\\s+");
            String tmp = "";
            for (int i = 0; i < list.length; i++) {
                tmp = tmp + Character.toUpperCase(list[i].charAt(0));
                for (int j = 1; j < list[i].length(); j++) {
                    tmp = tmp + Character.toLowerCase(list[i].charAt(j));
                }
                if (i != list.length - 1) {
                    tmp += " ";
                }
            }
            System.out.println(tmp);
        }
    }
}
