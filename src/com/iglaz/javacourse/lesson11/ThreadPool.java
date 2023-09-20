package com.iglaz.javacourse.lesson11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Executors.newSingleThreadExecutor();

        Executors.newScheduledThreadPool(5);
        Executors.newWorkStealingPool();

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        executorService.execute(() -> System.out.println("hello"));
        Future<Integer> submit = executorService.submit(() -> 2);

        executorService.shutdownNow();
        submit.get();
        executorService.shutdown();
    }
}
