public class NoPermissionGrantedException extends Exception{
    public NoPermissionGrantedException(String message) {
        super(message);
    }

    public NoPermissionGrantedException(String message, Throwable cause) {
        super(message, cause);
    }
}
