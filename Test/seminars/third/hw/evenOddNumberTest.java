package seminars.third.hw;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class evenOddNumberTest {

    @Test
    public void testNumbers() {

        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(3));
        assertTrue(evenOddNumber.evenOddNumber(4));
    }
}
