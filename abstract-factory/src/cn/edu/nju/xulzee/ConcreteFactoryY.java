package cn.edu.nju.xulzee;

public class ConcreteFactoryY implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductAY();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductBY();
    }
}
