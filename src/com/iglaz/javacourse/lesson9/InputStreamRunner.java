package com.iglaz.javacourse.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file1 = new File(String.join(File.separator, "resource", "text.txt"));
        File file2 = Paths.get("resources", "test.txt").toFile();

        try (FileInputStream inputStream = new FileInputStream(file2)) {
//            byte[] bytes = inputStream.readAllBytes();
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }

            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
