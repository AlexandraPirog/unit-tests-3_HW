package seminars.third.hw;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class numberIntervalTest {

    @Test
    public void testNumbers() {

        NumberInterval numberInterval = new NumberInterval();
        assertFalse(numberInterval.numberInInterval(3));
        assertTrue(numberInterval.numberInInterval(25));
        assertFalse(numberInterval.numberInInterval(101));
        assertTrue(numberInterval.numberInInterval(54));
    }
}
