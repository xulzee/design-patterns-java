package cn.edu.nju.xulzee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xulzee
 * @date 2020/03/30
 */
public abstract class AbstractSubject {
    private List<Observer> observerList = new ArrayList<>();
    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer){
        observerList.add(observer);
    };

    /**
     * 删除观察者
     * @param observer 观察者
     */
    public void detach(Observer observer){
        observerList.remove(observer);
    };

    /**
     * 将消息通知观察者们
     */
    public void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    };

    /**
     * 获取所观察对象的状态
     * @return 获取到的所观察对象的状态
     */
    public abstract int getState();

    /**
     * 设置所观察对象的状态
     * @param state 设置所观察对象的状态值
     */
    public abstract void setState(int state);
}
