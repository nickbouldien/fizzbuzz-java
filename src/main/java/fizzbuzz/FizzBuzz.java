package fizzbuzz;

// Write some code that prints out the following for a contiguous range of numbers:
// 1. the number
// 2. 'fizz' for numbers that are multiples of 3
// 3. 'buzz' for numbers that are multiples of 5
// 4. 'fizzbuzz' for numbers that are multiples of 15

public class FizzBuzz {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        int num = 20;

        run(num);
    }

    private static void run(int num) {
        for (int i = 1; i <= num; i++) {
            if (hasDigit(3, i)) {
                System.out.println("lucky");
            } else {
                if (i % 15 == 0) {
                    // multiple of 5 && 7
                    System.out.println("fizzbuzz");
                } else if (i % 3 == 0) {
                    // multiple of 3
                    System.out.println("fizz");
                } else if (i % 5 == 0) {
                    // multiple of 5
                    System.out.println("buzz");
                } else {
                    // other
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean hasDigit(int digit, int number) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number = number / 10;
        }
        return false; 
    } 
}
