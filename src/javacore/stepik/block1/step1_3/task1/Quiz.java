package javacore.stepik.block1.step1_3.task1;

import java.security.MessageDigest;

public class Quiz {
    public static void main(String[] args) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte [] digest = md.digest("abracadabra". getBytes("UTF-8"));
        for (byte b : digest) {
            System. out.printf("%02x" , b);


        }
    }
}
