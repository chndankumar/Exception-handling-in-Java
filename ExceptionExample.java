package Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        int i = 0;
        int j = 18;
        try {
            j = j / i;
        } catch (Exception e) {
            System.out.println("Something is not good");
            System.out.println(e.getMessage());
        }
        System.out.println(j);
        System.out.println("bye");
    }
    // applying the try and catch block it frist try to run the code if it find that
    // is have some error it will create an object of exception type and through it
    // to catch block with the errortype and message
}