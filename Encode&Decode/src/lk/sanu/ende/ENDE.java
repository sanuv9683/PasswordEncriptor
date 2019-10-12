/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.sanu.ende;

import java.util.Base64;

/**
 *
 * @author sanu
 */
public class ENDE {

    public static String encode(String encode) {
        String reversed = new StringBuilder(encode).reverse().toString();
        byte[] bytes = reversed.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decode(String decode) {
        byte[] decoded = Base64.getDecoder().decode(decode);
        String decode1 = new String(decoded);
        return new StringBuilder(decode1).reverse().toString();
    }
}
