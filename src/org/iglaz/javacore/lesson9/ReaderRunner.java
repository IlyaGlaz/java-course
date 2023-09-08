package org.iglaz.javacore.lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderRunner {

    private static final String VAULS = "ауэиео";

    public static void main(String[] args) throws IOException {

        File file2 = new File(String.join(File.separator, "resource", "test.txt"));

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                String[] s1 = s.split(" ");
                for (int i = 0; i < s1.length; i++) {
                    if (VAULS.indexOf(s1[i].charAt(0)) != -1) {
                        System.out.println(s1[i]);
                    }
                }
            }
        }
    }
}
