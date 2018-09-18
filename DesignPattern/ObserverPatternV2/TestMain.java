package DesignPattern.ObserverPatternV2;

import java.util.Observer;

public class TestMain {
    public static void main(String args[]) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl();
        observable.addObserver(observer1);
        observable.LikeHouse();
    }
}
