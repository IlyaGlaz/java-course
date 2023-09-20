package com.iglaz.javacourse.lesson11;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRunner {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                if (scanner.hasNextInt()) {
                    int seconds = scanner.nextInt();
                    if (seconds < 0) {
                        break;
                    }
                    service.submit(() -> {
                        Integer integer = threadLocal.get();
                        threadLocal.set(integer == null ? 0 : ++integer);
                        Thread.sleep(seconds * 1000L);
                        System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
                        System.out.println(Thread.currentThread().getName() + " " + seconds);
                        return 2;
                    });
                }
            }
        }
        service.shutdown();
    }
}
