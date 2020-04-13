package cn.edu.nju.xulzee;

/**
 * Product 工厂实现类
 *
 * @author xulzee
 * @date 2020/04/13

 */
public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
