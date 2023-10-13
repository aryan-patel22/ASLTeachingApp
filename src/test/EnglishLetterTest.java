package test;

import model.EnglishLetter;
import model.HandSign;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishLetterTest {

    @Test
    void translateLetter() {
        EnglishLetter a = new EnglishLetter("A", 1);
        assertEquals(new HandSign(1, "A"), a.translateLetter());
    }

    @Test
    void isMatch() {
        EnglishLetter a = new EnglishLetter("A", 1);
        HandSign h = new HandSign(1, "A");
        assertEquals(true, a.isMatch(h));
    }

}