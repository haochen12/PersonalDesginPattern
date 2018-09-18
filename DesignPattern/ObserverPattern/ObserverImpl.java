package DesignPattern.ObserverPattern;

public class ObserverImpl implements IObserver {
    IObserved observered = new ObservedImpl();

    @Override
    public void update() {
        observered.spy("敌人已经活动");
    }
}
