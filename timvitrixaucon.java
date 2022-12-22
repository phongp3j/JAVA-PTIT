package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class timvitrixaucon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\HI\\Documents\\NetBeansProjects\\codeptit\\src\\main\\java\\com\\mycompany\\codeptit\\test.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < t ; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for(int j = 0 ; j < s1.length() ; j++){
                if(s2.charAt(0) == s1.charAt(j)){
                    int check = 0;
                    for(int k = 0 ; k < s2.length() ; k++){
                        if(k+j <s1.length() && s1.charAt(k+j) == s2.charAt(k)){
                            continue;
                        }
                        else{
                            check = 1;
                            break;
                        }
                    }
                    if(check == 0){
                        System.out.print(j+1 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
