package de.cschaf.examples;

import de.cschaf.examples.events.EventArgs;
import de.cschaf.examples.events.ILetterListener;

import javax.swing.event.EventListenerList;
import java.util.ArrayList;

/**
 * Created by cschaf on 30.03.2015.
 * Letterbix class to hold letters
 */
public class Letterbox {
    protected EventListenerList listeners = new EventListenerList();
    private ArrayList<Letter> letters;

    public Letterbox() {
        this.letters = new ArrayList<Letter>();
    }

    public void addLetter(Letter letter) {
        this.letters.add(letter);
        letterReceived(new EventArgs<Letter>(this, letter));
    }

    public void addLetterListener(ILetterListener listener) {
        this.listeners.add(ILetterListener.class, listener);
    }

    public void removeLetterListener(ILetterListener listener) {
        this.listeners.remove(ILetterListener.class, listener);
    }

    void letterReceived(EventArgs<Letter> eventArgs) {
        Object[] listeners = this.listeners.getListenerList();
        for (int i = 0; i < listeners.length; i = i+2) {
            if (listeners[i] == ILetterListener.class) {
                ((ILetterListener) listeners[i+1]).onLetterReceived(eventArgs);
            }
        }
    }
}
