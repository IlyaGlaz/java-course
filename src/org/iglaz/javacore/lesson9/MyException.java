package org.iglaz.javacore.lesson9;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
