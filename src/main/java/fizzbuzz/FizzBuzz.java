package fizzbuzz;

// Write some code that prints out the following for a contiguous range of numbers:
// 1. the number
// 2. 'fizz' for numbers that are multiples of 3
// 3. 'buzz' for numbers that are multiples of 5
// 4. 'fizzbuzz' for numbers that are multiples of 15

import java.util.HashMap;  

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        int num = 20;
        fb.run(num);
    }

    public HashMap<String, Integer> run(int num) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put("lucky", 0);
        result.put("fizzbuzz", 0);
        result.put("fizz", 0);
        result.put("buzz", 0);
        result.put("integer", 0);

        for (int i = 1; i <= num; i++) {
            if (hasDigit(3, i)) {
                result.put("lucky", result.get("lucky") + 1);
                System.out.println("lucky");
            } else {
                if (i % 15 == 0) {
                    // multiple of 5 && 7
                    result.put("fizzbuzz", result.get("fizzbuzz") + 1);
                    System.out.println("fizzbuzz");
                } else if (i % 3 == 0) {
                    // multiple of 3
                    result.put("fizz", result.get("fizz") + 1);
                    System.out.println("fizz");
                } else if (i % 5 == 0) {
                    // multiple of 5
                    result.put("buzz", result.get("buzz") + 1);
                    System.out.println("buzz");
                } else {
                    // other
                    result.put("integer", result.get("integer") + 1);
                    System.out.println(i);
                }
            }
        }

        result.entrySet().forEach(entry -> {
           System.out.println(entry.getKey() + ": " + entry.getValue());
        });

        return result;
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
