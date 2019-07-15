
public class Castle extends Subject {

    private boolean underSiege = false;

    public Castle() {

    }

    void setUnderSiege(boolean b) {
        underSiege = b;
        notifyObservers();
    }

    @Override
    void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.takeAction(underSiege);
        }

    }

}
