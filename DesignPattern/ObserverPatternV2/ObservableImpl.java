package DesignPattern.ObserverPatternV2;

import java.util.Observable;

public class ObservableImpl extends Observable implements IGirl {

    @Override
    public void likeCothe() {
        setChanged();
        notifyObservers("喜欢衣服");
    }

    @Override
    public void likeFood() {
        setChanged();
        notifyObservers("喜欢食物");
    }

    @Override
    public void LikeHouse() {
        setChanged();
        notifyObservers("喜欢房子");
    }

    @Override
    public void likeCar() {
        setChanged();
        notifyObservers("喜欢车子");
    }
}
