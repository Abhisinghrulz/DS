package designPattern.behavioral.observer;

public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notify(Message m);
}