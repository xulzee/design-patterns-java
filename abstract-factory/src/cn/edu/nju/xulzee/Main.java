package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/02
 */
public class Main {
    public static void main(String[] args) {
        ConcreteFactoryX concreteFactoryX = new ConcreteFactoryX();
        ConcreteFactoryY concreteFactoryY = new ConcreteFactoryY();

        ProductA productA = concreteFactoryX.createProductA();
        System.out.println("Product: " + productA.getName());

        ProductB productB = concreteFactoryY.createProductB();
        System.out.println("Product: " + productB.getName());
    }
}
