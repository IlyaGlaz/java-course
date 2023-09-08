package org.iglaz.javacore.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        File file2 = new File(String.join(File.separator, "resource", "text.txt"));

        try (FileInputStream inputStream = new FileInputStream(file2)) {
        }
    }
}

