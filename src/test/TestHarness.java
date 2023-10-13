package test;

import model.EnglishLetter;
import model.HandSign;
import model.display;

public class TestHarness {
    public static void main(String[] args) {
        new TestHarness();
    }

    public TestHarness() {

        int numFails = 0;
        display test = new display("OR");

        if (test.getUserSentence() != "OR") {
            System.out.println("test(OR) failed the test");
            numFails ++;
        }

        test.toEnglishLetter();
        EnglishLetter[] englishSentence =  new EnglishLetter[2];
        englishSentence[0] = new EnglishLetter("O");
        englishSentence[1] = new EnglishLetter("R");

        if (englishSentence == test.toEnglishLetter()) {
            System.out.println("toEnglishLetter() failed the test");
            numFails ++;
        }

        test.toHandSign();
        HandSign[] signSentence =  new HandSign[2];
        signSentence[0] = new HandSign("O");
        signSentence[1] = new HandSign("R");

        if (signSentence == test.toHandSign()) {
            System.out.println("toHandSign() failed the test");
            numFails ++;
        }

        if ( numFails == 0) {
            System.out.println("All tests pass");
        } else {
            System.out.println(numFails + " tests failed");
        }
    }


}
