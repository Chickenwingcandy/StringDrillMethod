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
    void lastLetterTest() {

        String lastLetter = "ea";

        String actual = "a";

        String result = sd.lastLetter(lastLetter);

        assertEquals(actual,result);
    }

    @Test
    void firstLetterTest() {
        String firstLetter = "fa";

        String actual = "f";

        String result = sd.firstLetter(firstLetter);

        assertEquals(actual,result);
    }

    @Test
    void partOfSentenceTest() {
        String inputSentence = "Test is";

        String actual = "Test ";
        String result = sd.partOfSentence(inputSentence);

        assertEquals(actual,result);
    }

    @Test
    void makeTheSentenceBackwardsTest() {
        String input = "Abcd";

        String actual = "dcbA";
        String expected = sd.makeTheSentenceBackwards(input);

        assertEquals(actual, expected);
    }

    @Test
    void countToANumberTest() {
        int number = 5;

        String actual = "0 " + "1 " + "2 " + "3 " + "4 " + "5 ";
        String expected = sd.countToANumber(number);

        assertEquals(actual,expected);
    }
}
