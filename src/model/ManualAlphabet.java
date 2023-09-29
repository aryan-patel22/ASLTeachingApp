// Aryan Patel IST 261 ASL Teaching App
package model;

public class ManualAlphabet {

    HandSign[] alphabet =  new HandSign[26]; //Alphabet of Hand sign objects

    public ManualAlphabet(HandSign[] alphabet){ //Constructor for Manual/Hand sign alphabet
        this.alphabet = alphabet;
    }

    public void setAlphabet(HandSign[] alphabet){   //getter for hand sign alphabet
        this.alphabet = alphabet;
    }

    public HandSign[] getAlphabet(){    //setter for handsign alphabet
        return this.alphabet;
    }
}
