// Aryan Patel IST 261 ASL Teaching App
package model;

public class HandSign {
    private int position; //position in alphabet for easier tracking
    private char letter; //corresponding english letter
    public HandSign(int position, char letter){
        this.position = position;
        this.letter = letter;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public char getLetter(){
        return this.letter;
    }

}
