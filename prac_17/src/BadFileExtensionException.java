public class BadFileExtensionException extends RuntimeException {
    public BadFileExtensionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
