package com.iglaz.javacourse.lesson9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        Scanner scanner = new Scanner(path);
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            list.add(next);
        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
        }

        Path pathWrite = Path.of("resources", "test2.txt");
        Files.write(pathWrite, list, StandardOpenOption.APPEND);

//        new File(String.join(File.separator, "resurces", "test.txt"));
//        File.separator
    }
}
