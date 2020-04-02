package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/30
 */
public class ConcreteObserver implements Observer {
    private int observerState;

    public ConcreteObserver(int observerState) {
        this.observerState = observerState;
    }

    @Override
    public int getState() {
        return observerState;
    }

    @Override
    public void update(AbstractSubject abstractSubject) {
        observerState = abstractSubject.getState();
        System.out.println("Observer state updated.");
    }
}
