package mars.hong.software.CICD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void sum_of_two_number() {
        int a = 0;
        int b = 1;

        assertEquals(1, sum(a, b));
    }

    private int sum(int a, int b) {
        return a + b;
    }
}
