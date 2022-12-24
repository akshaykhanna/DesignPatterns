package singelton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerTest {
    @Test
    void shouldHaveOnlySingleInstanceOfLogger() {
        var instance1 = Logger.getInstance();
        var instance2 = Logger.getInstance();

        Assertions.assertEquals(true, instance1 == instance2);

    }

    @Test
    void shouldNotBeAbleToCreateMultipleObjectOfLoggerClass() {
        var instance1 = Logger.getInstance();
        var instance2 = Logger.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        Assertions.assertEquals(true, instance1 == instance2);

    }
}