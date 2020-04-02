package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/02
 * <p>
 * Decorator
 * 维护一个component对象的引用，并定义了一个符合component接口的接口
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
