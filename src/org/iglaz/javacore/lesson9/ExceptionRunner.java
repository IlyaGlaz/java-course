package org.iglaz.javacore.lesson9;

import java.io.IOException;
import java.util.Random;

public class ExceptionRunner {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(3);

        System.out.println("Before");
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("Finally");
        }
    }

    public static void unsafe() throws IOException {
        System.out.println(" unsafe");
        throw new IOException();
    }
}
