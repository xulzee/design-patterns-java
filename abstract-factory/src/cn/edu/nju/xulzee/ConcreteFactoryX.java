package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/18
 */
public class ConcreteFactoryX implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductAX();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductBX();
    }
}
