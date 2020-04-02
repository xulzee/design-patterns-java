package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/02
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(
                new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();
    }
}
