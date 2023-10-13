// Aryan Patel IST 261 ASL Teaching App
package model;
import java.lang.Math;

public class HandSign {
    private int position; //position in alphabet for easier tracking
    private String letter; //corresponding english letter
    public HandSign(int position, String letter){
        this.position = position;
        this.letter = letter;
    }

    public HandSign(String letter){
        this.letter = letter;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public void setLetter(String letter){
        this.letter = letter;
    }

    public String getLetter(){
        return this.letter;
    }

    public EnglishLetter translateHandSign(){
        return (new EnglishLetter(this.getLetter(), this.getPosition()));
    }

    public boolean isMatch(EnglishLetter letter){
        if (letter.getPosition() == this.getPosition()){
            return true;
        } else {
            return false;
        }
    }

    public void randomizeHandSign(){
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
