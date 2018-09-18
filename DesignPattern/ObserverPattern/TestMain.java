package DesignPattern.ObserverPattern;

public class TestMain {
    public static void main(String args[]) {
        IObserver observer = new ObserverImpl();
        observer.update();
    }
}
