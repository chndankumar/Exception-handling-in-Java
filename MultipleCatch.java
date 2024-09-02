package Exception;

public class MultipleCatch {
    public static void main(String[] args) {

        int i = 0;
        int j = 18;
        int[] arr = new int[6];
        String str = null;

        try {
            j = j / i;
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("Something is not good");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            // this is to handle the sting size exception
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("bye");

    }
    // If an exception occurs within a try block, execution jumps to the first
    // matching catch block, and the rest of the try block is skipped.
    // You can use multiple catch blocks to handle different types of exceptions.
    // Only the first matching catch block will execute; subsequent catch blocks are
    // ignored.
    // Always use the most specific exception class when handling exceptions.
}