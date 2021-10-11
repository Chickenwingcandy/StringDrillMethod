import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class sDrillsTest {

    sDrills sd;

    @BeforeEach
    void setUp(){
        sd = new sDrills();
    }

    @Test
    void howLongIsThisWordTest() {

        String actual = "5";

        String result = sd.howLongIsThisWord("12345");

        assertEquals(actual,result);
    }

    @Test
    void lastLetter() {

        String lastLetter = "ea";

        String actual = "a";

        String result = sd.lastLetter(lastLetter);

        assertEquals(actual,result);
    }
}
