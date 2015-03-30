package de.cschaf.examples;

import de.cschaf.examples.events.ILetterListener;

import javax.swing.event.EventListenerList;
import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by cschaf on 30.03.2015.
 * Postman class for delivering letters to a letterbox
 */
public class Postman {
    protected EventListenerList listeners = new EventListenerList();
    private String name;
    private ArrayList<Letter> bag;

    public Postman(String name) {
        this.name = name;
        this.bag = new ArrayList<Letter>();
    }

    public void deliverLetter(Letterbox letterbox) {
        if (this.bag.size() == 0) {
            throw new EmptyStackException();
        }
        Letter next = this.bag.get(0);
        this.bag.remove(0);
        letterbox.addLetter(next);
        letterSent();
    }

    public void addLetterToBag(Letter letter) {
        this.bag.add(letter);
    }

    public void addLetterListener(ILetterListener listener) {
        this.listeners.add(ILetterListener.class, listener);
    }

    public void removeLetterListener(ILetterListener listener) {
        this.listeners.remove(ILetterListener.class, listener);
    }

    void letterSent() {
        Object[] listeners = this.listeners.getListenerList();
        for (int i = 0; i < listeners.length; i = i + 2) {
            if (listeners[i] == ILetterListener.class) {
                ((ILetterListener) listeners[i + 1]).onLetterSent();
            }
        }
    }

    public String getName() {
        return name;
    }
}
