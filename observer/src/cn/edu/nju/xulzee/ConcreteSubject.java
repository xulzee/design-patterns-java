package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/30
 */
public class ConcreteSubject extends AbstractSubject {
    private int subjectState;

    @Override
    public int getState() {
        return subjectState;
    }

    @Override
    public void setState(int state) {
        subjectState = state;
    }
}
