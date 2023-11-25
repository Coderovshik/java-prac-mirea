public class InvalidIdException extends RuntimeException {
    public InvalidIdException(String errorMeassage, Throwable err) {
        super(errorMeassage, err);
    }
}
