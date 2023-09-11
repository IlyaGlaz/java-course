package com.iglaz.javacourse.lesson9.task;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task1 {
    private static final String VAWALS = "ауейюёои";

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String next = scanner.next();
                if (VAWALS.indexOf(next.charAt(0)) != -1) {
                    System.out.println(next);
                }
            }
        }
    }
}
