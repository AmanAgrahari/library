package library.library.exception;

public class LibraryException extends RuntimeException {
    public LibraryException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public LibraryException(String message, String errorMsg) {
        super( message );
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    private String errorMsg;

}
