package org.iglaz.javacore.lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class OutputStream {

    public static void main(String[] args) throws IOException {
        File file2 = new File(String.join(File.separator, "resource", "text.txt"));

        final Scanner scanner = new Scanner(Paths.get("resource", "test.txt"));

        if (scanner.hasNext()) {
            String next = scanner.nextLine();
        }

        final BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("resource", "test.txt"));

        final List<String> strings = Files.readAllLines(Paths.get("resource", "test.txt"));

        Files.write(Paths.get("resource", "test2222.txt"), "Hello, world".getBytes());

        for (String string:
                strings) {
            System.out.println(string);
        }

        bufferedReader.readLine();
    }
}
