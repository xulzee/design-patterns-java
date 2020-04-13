package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/13
 */
public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.createProduct();
        System.out.println("Product: " + product.getName());

        creator = new ConcreteCreatorB();
        product = creator.createProduct();
        System.out.println("Product: " + product.getName());
    }
}
