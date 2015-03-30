package de.cschaf.examples;
import de.cschaf.examples.events.LetterboxListener;
import de.cschaf.examples.events.PostmanListener;

/**
 * Main application
 */
public class App {
    public static void main(String[] args) {
        // create letterbox
        Letterbox letterbox = new Letterbox();
        // add EventListener to letterbox
        letterbox.addLetterListener(new LetterboxListener());
        // create postman
        Postman postman = new Postman("Peter");
        // add EventListener to postman
        postman.addLetterListener(new PostmanListener(postman));
        // write letter
        Letter letterForMom = new Letter("Dear mum", "How are you. Iam fine. I hope we see us next suturday!", "Love you");
        // give letter to postman
        postman.addLetterToBag(letterForMom);
        // postman delivers letter
        postman.deliverLetter(letterbox);

    }
}
