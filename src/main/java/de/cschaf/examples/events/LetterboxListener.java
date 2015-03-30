package de.cschaf.examples.events;

import de.cschaf.examples.Letter;

/**
 * Created by cschaf on 30.03.2015.
 * EventListener for Letterbox
 */
public class LetterboxListener implements ILetterListener {
    public void onLetterSent() {
        // do nothing
    }

    public void onLetterReceived(EventArgs<Letter> eventArgs) {
        System.out.println("You have received a new letter");
        System.out.println();
        System.out.println(eventArgs.getItem());
    }
}
