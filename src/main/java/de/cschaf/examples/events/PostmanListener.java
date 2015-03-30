package de.cschaf.examples.events;

import de.cschaf.examples.Letter;
import de.cschaf.examples.Postman;
import de.cschaf.examples.events.EventArgs;
import de.cschaf.examples.events.ILetterListener;
import javafx.geometry.Pos;

/**
 * Created by cschaf on 30.03.2015.
 * EventListener for Letterbox
 */
public class PostmanListener implements ILetterListener {
    private Postman postman;
    public PostmanListener(Postman postman){
        this.postman = postman;
    }
    public void onLetterSent() {
        System.out.println(this.postman.getName() + " has delivered a letter");
    }

    public void onLetterReceived(EventArgs<Letter> eventArgs) {
        // do nothing
    }
}
