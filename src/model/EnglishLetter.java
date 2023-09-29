// Aryan Patel IST 261 ASL Teaching App
package model;

public class EnglishLetter {
    private char letter; //english letter this object is
    private int position; //position in alphabet for easier tracking
    public EnglishLetter(char letter, int position){
        this.letter = letter;
        this.position = position;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public char getLetter(){
        return this.letter;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }
}
