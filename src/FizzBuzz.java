public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) { // i % 5 can only be != 0 at this point, no need to check
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) { // i % 3 can only be != 0 at this point, no need to check
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}


