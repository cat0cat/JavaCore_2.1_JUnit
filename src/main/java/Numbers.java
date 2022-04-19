import java.math.BigInteger;
import java.util.stream.IntStream;

public class Numbers {

    // является ли число простым
    public boolean isPrime(int num){
        for (int i = 2; i <= num/2; i++) {
            int temp = num % i;
            if (temp == 0)
                return false;
            }
        return true;
    }

    // вычисление суммы чисел от 0 до заданного числа
    public int sumNumbers(int num) {
        return IntStream.rangeClosed(0,num).reduce(Integer::sum).getAsInt();
    }

    // вычисление суммы цифр числа
    public long sumDigits(long с) {
        return с == 0 ? 0 : с % 10 + sumDigits(с / 10);
    }

    // вычисление факториала
    public BigInteger getFactorial(int f) {
        if (f < 2) {
            return BigInteger.valueOf(1);
        }
        else {
            return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }

    // перевод строки в число
    public int strToInt(String s) {
        return Integer.parseInt(s);
    }

}
