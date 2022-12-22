package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class sv {

    public String ma, ten, xep;
    public double tb;

    public sv(int i, String ten, double s1, double s2, double s3) {
        if (i < 10) {
            this.ma = "SV0" + i;
        } else {
            this.ma = "SV" + i;
        }
        String res = "";
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for (String j : s) {
            res = res + Character.toUpperCase(j.charAt(0)) + j.substring(1) + " ";
        }
        this.ten = res;
        this.tb = (s1 * 0.25 + s2 * 0.35 + s3 * 0.4);
        if (this.tb >= 8) {
            this.xep = "GIOI";
        } else if (this.tb >= 6.5) {
            this.xep = "KHA";
        } else if (this.tb >= 5) {
            this.xep = "TRUNG BINH";
        } else {
            this.xep = "KEM";
        }
    }

    public double getTb() {
        return tb;
    }

    public void out() {
        System.out.println(this.ma + " " + this.ten + String.format("%.2f", this.tb) + " " + this.xep);
    }
}

public class xeploai {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<sv> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            list.add(new sv(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                if(o1.tb  < o2.tb){
                    return 1;
                }
                return -1;
            }

        });
        for (sv i : list) {
            i.out();
        }
    }
}
