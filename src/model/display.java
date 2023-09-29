// Aryan Patel IST 261 ASL Teaching App
package model;

public class display {
    private String sentence; //what user typed to be displayed
    private boolean isHandSign; //tells whether sentence sent was from using hand signs or english letters

    public display(String sentence, boolean isHandSign){   //Constructor for display
        this.sentence = sentence;
        this.isHandSign = isHandSign;
    }

    public void setSentence(String sentence){  //Getter for sentence to display
        this.sentence = sentence;
    }

    public String getSentence(){   //Setter for sentence to display
        return this.sentence;
    }

    public void setIsHandSign(boolean isHandSign){  //Getter for isHandSign
        this.isHandSign = isHandSign;
    }

    public boolean getIsHandSign(){   //Setter for isHandSign
        return this.isHandSign;
    }
}
