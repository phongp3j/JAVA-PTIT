/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HI
 */
class doanhnghiep {

    public String ma, ten;
    public int so;

    public doanhnghiep(String ma, String ten, int so) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }

    public String getMa() {
        return ma;
    }

    public void out() {
        System.out.println(this.ma + " " + this.ten + " " + this.so);
    }
}

public class Danhsachdoanhnghiep {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<doanhnghiep> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new doanhnghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<doanhnghiep>() {
            @Override
            public int compare(doanhnghiep o1, doanhnghiep o2) {
                return o1.getMa().compareTo(o2.getMa());
            }

        });
        for(doanhnghiep i : list){
            i.out();
        }
    }
}
