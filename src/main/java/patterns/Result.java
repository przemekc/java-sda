package patterns;

public class Result {

    private boolean error;
    private String message;

    private Result() {
    }

    private Result(boolean error, String message) {
        this.error = error;
        this.message = message;
    }

    public static Result ok() {
        return new Result();
    }

    public static Result error(String mesage) {
        return new Result(true, mesage);
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
