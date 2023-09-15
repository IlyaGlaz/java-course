package com.iglaz.javacourse.lesson11.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread extends Thread {
    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();
            System.out.println(getName() + " обслуживается в кассе " + cashbox);

            Thread.sleep(5L);

            System.out.println(getName() + " освобожаю кассу " + cashbox);
            cashboxes.add(cashbox);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
