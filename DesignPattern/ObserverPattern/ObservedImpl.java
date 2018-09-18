package DesignPattern.ObserverPattern;

public class ObservedImpl implements IObserved {
    @Override
    public void spy(String content) {
        System.out.print(content);
    }
}
