package multiThread.cdl;

import java.util.concurrent.TimeoutException;

public class WaitTimeoutException extends TimeoutException {
    public WaitTimeoutException(String s) {
        super(s);
    }
}
