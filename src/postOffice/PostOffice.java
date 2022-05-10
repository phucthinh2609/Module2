package postOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
    public String message;
    List<Observer> observerList;

    PostOffice(){
        observerList = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.updateMessage(message);
        }
    }

    public void newMail(String message){
        this.message = message;
    }
}
