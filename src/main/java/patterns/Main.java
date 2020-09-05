package patterns;

public class Main {

    public static void main(String[] args) {
        Result result = Result.ok();
        if(result.isError()) {
            System.out.println(result.getMessage());
        } else {
            System.out.println(result.isError());
        }

        Result error = Result.error("Error");
        System.out.println(error.isError());
    }
}
