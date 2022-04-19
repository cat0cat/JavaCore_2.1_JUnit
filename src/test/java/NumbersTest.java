import org.junit.jupiter.api.*;

import java.math.BigInteger;

class NumbersTest {

    Numbers numbers;
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("StringTest complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new nest");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @Test
    @DisplayName("Проверка корректности проверки простого числа")
    void isPrime() {
        // given:
        final int num = 67;
        final boolean expected = true;
        // when:
        boolean actual = numbers.isPrime(num);
        // then:
        Assertions.assertEquals(actual,expected);
        //Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка корректности суммы чисел от 0 до заданного числа")
    void sumNumbers() {
        // given:
        final int num = 34;
        final int expected = 595;
        // when:
        int actual = numbers.sumNumbers(num);
        // then:
        Assertions.assertEquals(actual,expected);
    }

    @Test
    @DisplayName("Проверка корректности суммы цифр заданного числа")
    void sumDigits() {
        // given:
        final int num = 32151;
        final long expected = 12;
        // when:
        long actual = numbers.sumDigits(num);
        // then:
        Assertions.assertEquals(actual,expected);
    }

    @Test
    @DisplayName("Проверка корректности факториала заданного числа")
    void getFactorial() {
        // given:
        final int num = 7;
        final BigInteger expected = BigInteger.valueOf(5040);
        // when:
        BigInteger actual = numbers.getFactorial(num);
        // then:
        Assertions.assertEquals(actual,expected);
    }

    @Test
    @DisplayName("Проверка перевода строки в число")
    void strToInt() {
        // given:
        final String s = "38";
        final int expected = 38;
        // when:
        int actual = numbers.strToInt(s);
        // then:
        Assertions.assertNotNull(s);
        Assertions.assertEquals(actual,expected);
    }


}