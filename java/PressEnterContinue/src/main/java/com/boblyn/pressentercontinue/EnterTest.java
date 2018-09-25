/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boblyn.pressentercontinue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marstor
 */
public class EnterTest {
    public static BufferedReader bfr = null;

    public static void main(String[] args) {
        bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("Please Input a: ");
                String typeValue = bfr.readLine().trim();
                if(typeValue.length()==0){
                    continue;
                }
                char command = typeValue.toCharArray()[0];
                switch (command) {
                    case 'a':
                        getContent();
                        break;
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bfr != null) {
                    bfr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void getContent() throws IOException {
        int i = 1;
        do {
            System.out.println("=========" + i + "=========");
            if (i % 20 == 0) {
                String value = "";
                do {
                    value = bfr.readLine().trim();
                } while (value.length() != 0);
            }
            i++;
        } while (i < 100);
    }
}
