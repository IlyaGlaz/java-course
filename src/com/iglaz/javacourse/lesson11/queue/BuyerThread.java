package com.iglaz.javacourse.lesson11.queue;

import java.util.Queue;

public class BuyerThread extends Thread {
    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(getName() + " обслуживается в кассе " + cashbox);

                    Thread.sleep(5L);

                    System.out.println(getName() + " освобожаю кассу " + cashbox);
                    cashboxes.add(cashbox);
                    break;
                } else {
                    System.out.println(getName() + " ожидает свободную кассу");
                    Thread.sleep(5L);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
