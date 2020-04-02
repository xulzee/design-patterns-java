package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/30
 */
public interface Observer {
    /**
     * implement by subclass
     * @return int value of state
     */
    public abstract int getState();

    /**
     * implement by subclass
     * @param abstractSubject 观察者所观察的对象
     */
    public abstract void update(AbstractSubject abstractSubject);
}
