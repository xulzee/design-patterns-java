package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/28
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.callStrategy();
    }
}
