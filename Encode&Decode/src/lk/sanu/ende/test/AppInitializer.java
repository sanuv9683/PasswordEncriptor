package lk.sanu.ende.test;

import lk.sanu.ende.ENDE;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sanu
 */
public class AppInitializer {

    public static void main(String[] args) {
        System.out.print("Enter You Encodable String :");
        Scanner input = new Scanner(System.in);
        String encode = input.nextLine();
        String encodedString = ENDE.encode(encode);
        System.out.println("Your encoded String is :" + encodedString);

        System.out.print("Enter You Decode String :");
        String decode = input.nextLine();
        String decode1 = ENDE.decode(decode);
        System.out.println("Your decoded String is :" + decode1);
    }

}
