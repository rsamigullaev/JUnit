import org.junit.jupiter.api.*;

public class IgraTest {

    @BeforeEach
    public void printText() {
        System.out.println("Просто запускаем тест");
    }

    @AfterAll
    public static void printAfterText() {
        System.out.println("Мы протестировали");
    }

    @Test
    @DisplayName("Проверка суммирования чисел")
    public void summInputInteger() {
        int value1 = 1;
        int value2 = 1;

        int allValue = value1 + value2;


        Assertions.assertEquals(value1 + value2, allValue);

    }

    @Test
    @DisplayName("Проверка разницы сумм")
    public void raznInputInteger2() {

        int value1 = 8;
        int value2 = 6;

        int allValue = value1 - value2;

        Assertions.assertEquals(value1 - value2, allValue);

    }

    @Test
    @DisplayName("Проверка неравных значений")
    public void notNullInputInteger2() {

        int value1 = 0;
        int value2 = 6;

        int allValue = value1 - value2;

        Assertions.assertNotEquals(value1 + value2, allValue);

    }
}
