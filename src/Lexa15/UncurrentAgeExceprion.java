package Lexa15;

public class UncurrentAgeExceprion extends Exception{

    public UncurrentAgeExceprion() {
    }

    public UncurrentAgeExceprion(String message) {
        super(message);
    }

    public UncurrentAgeExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeExceprion(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
