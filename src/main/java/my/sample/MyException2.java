package my.sample;

public class MyException2 extends Exception {

    public MyException2() {
        super();
    }

    public MyException2(String message) {
        super(message);
    }

    public MyException2(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException2(Throwable cause) {
        super(cause);
    }

}
