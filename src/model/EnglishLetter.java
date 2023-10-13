// Aryan Patel IST 261 ASL Teaching App
package model;
import java.lang.Math;

public class EnglishLetter {
    private String letter; //english letter this object is
    private int position; //position in alphabet for easier tracking
    public EnglishLetter(String letter, int position){
        this.letter = letter;
        this.position = position;
    }

    public EnglishLetter(String letter){
        this.letter = letter;
    }

    public void setLetter(String letter){
        this.letter = letter;
    }

    public String getLetter(){
        return this.letter;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public HandSign translateLetter(){
        return (new HandSign(this.getPosition(), this.getLetter()));
    }

    public boolean isMatch(HandSign handSign){
        if (handSign.getPosition() == this.getPosition()){
            return true;
        } else {
            return false;
        }
    }

    public void randomizeLetter(){
        int newPosition = 0;
        int min = 1;
        int max = 27;
        String newLetter = "";

        while (newPosition != this.getPosition()){
            newPosition = (int)(Math.random()*(max - min + 1) + min);
        }
        this.setPosition(newPosition);

        newLetter = String.valueOf((char)(newPosition + 64));
        this.setLetter(newLetter);

    }

}
