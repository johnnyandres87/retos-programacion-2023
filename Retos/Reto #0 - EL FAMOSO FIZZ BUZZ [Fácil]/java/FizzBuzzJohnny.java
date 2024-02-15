import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzJohnny {
    public static void main(String[] args) {
        printNumbers(1, 100);
    }

    private static void printNumbers(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (isFizzBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if (isFizz(i)) {
                System.out.println("Fizz");
            } else if (isBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
