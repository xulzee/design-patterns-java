package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/02
 * <p>
 * Concrete Decorator
 * 向组件添加职责（可以扩展组件的状态）
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Decorator A");
    }
}
