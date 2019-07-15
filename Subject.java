import java.util.ArrayList;

public abstract class Subject {

    ArrayList observers = new ArrayList();

    void addObserver(Observer o) {
        observers.add(o);
    }

    void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    abstract void notifyObservers();

}
