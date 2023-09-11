package com.iglaz.javacourse.lesson9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "test.txt").toFile();
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
