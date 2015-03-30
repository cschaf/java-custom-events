package de.cschaf.examples.events;

import de.cschaf.examples.Letter;

import java.util.EventListener;

/**
 * Created by cschaf on 30.03.2015.
 */
public interface ILetterListener extends EventListener {
    void onLetterSent();
    void onLetterReceived(EventArgs<Letter> eventArgs);
}
