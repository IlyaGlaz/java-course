package com.iglaz.javacourse.lesson11.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CashboxRunner {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            try {
                Thread.sleep(20000L);
                System.out.println("Hello World");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Queue<Cashbox> cashboxes = new ArrayDeque<>(List.of(new Cashbox(), new Cashbox()));

        BuyerThread buyerThread1 = new BuyerThread(cashboxes);
        BuyerThread buyerThread2 = new BuyerThread(cashboxes);
        BuyerThread buyerThread3 = new BuyerThread(cashboxes);
        BuyerThread buyerThread4 = new BuyerThread(cashboxes);
        BuyerThread buyerThread5 = new BuyerThread(cashboxes);
        BuyerThread buyerThread6 = new BuyerThread(cashboxes);
        BuyerThread buyerThread7 = new BuyerThread(cashboxes);

        buyerThread1.start();
        buyerThread2.start();
        buyerThread3.start();
        buyerThread4.start();
        buyerThread5.start();
        buyerThread6.start();
        buyerThread7.start();

        buyerThread1.join();
        buyerThread2.join();
        buyerThread3.join();
        buyerThread4.join();
        buyerThread5.join();
        buyerThread6.join();
        buyerThread7.join();
    }
}
