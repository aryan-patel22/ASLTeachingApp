package test;

import model.EnglishLetter;
import model.HandSign;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandSignTest {

    @Test
    void translateHandSign() {
        HandSign h = new HandSign(1, "H");
        assertEquals(new EnglishLetter("H", 1), h.translateHandSign());
    }

    @Test
    void isMatch() {
        HandSign h = new HandSign(1, "H");
        EnglishLetter a = new EnglishLetter("H", 1);
        assertEquals(true, h.isMatch(a));
    }

}