package de.cschaf.examples.events;
import java.util.EventListener;
import java.util.EventObject;
/**
 * Created by cschaf on 27.03.2015.
 */
public class EventArgs<T> extends EventObject{
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @throws IllegalArgumentException if source is null.
   */
  private T item;

  public EventArgs(Object source, T item){
    super(source);
    this.item = item;
  }

  public T getItem() {
    return item;
  }
}
