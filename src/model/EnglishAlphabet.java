// Aryan Patel IST 261 ASL Teaching App
package model;

public class EnglishAlphabet {
    EnglishLetter[] alphabet =  new EnglishLetter[26]; //Alphabet of English Letter Objects

    public EnglishAlphabet(EnglishLetter[] alphabet){   //Constructor for English Alphabet
        this.alphabet = alphabet;
    }

    public void setAlphabet(EnglishLetter[] alphabet){  //Getter for english alphabet
        this.alphabet = alphabet;
    }

    public EnglishLetter[] getAlphabet(){   //Setter for english alphabet
        return this.alphabet;
    }

}
