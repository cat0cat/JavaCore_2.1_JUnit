public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        numbers.isPrime(71);
        System.out.println(numbers.isPrime(71));

        numbers.sumNumbers(10);
        System.out.println(numbers.sumNumbers(10));

        numbers.sumDigits(341);
        System.out.println(numbers.sumDigits(341));

        numbers.getFactorial(5);
        System.out.println(numbers.getFactorial(5));

        numbers.strToInt("45");
        System.out.println(numbers.strToInt("45"));
    }
}
