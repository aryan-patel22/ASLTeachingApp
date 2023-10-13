// Aryan Patel IST 261 ASL Teaching App
package model;

public class display {
    private String userSentence; //what user typed to be displayed
    private boolean isHandSign; //tells whether sentence sent was from using hand signs or english letters

    public display(String sentence){   //Constructor for display
        this.userSentence = sentence;
    }

    public void setUserSentence(String sentence){  //Getter for sentence to display
        this.userSentence = sentence;
    }

    public String getUserSentence(){   //Setter for sentence to display
        return this.userSentence;
    }

    public EnglishLetter[] toEnglishLetter(){
        int length = this.getUserSentence().length();
        EnglishLetter[] sentence =  new EnglishLetter[length];

        for (int x = 0; x <= length; x++){
            sentence[x] = new EnglishLetter(this.userSentence.substring(x,x+1));
        }

        return sentence;

    }

    public HandSign[] toHandSign(){
        int length = this.getUserSentence().length();
        HandSign[] sentence =  new HandSign[length];

        for (int x = 0; x <= length; x++){
            sentence[x] = new HandSign(this.userSentence.substring(x,x+1));
        }
        return sentence;
    }


}
