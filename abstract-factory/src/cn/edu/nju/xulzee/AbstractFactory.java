package cn.edu.nju.xulzee;


/**
 * 定义所有产品类A的接口
 *
 * @author xulzee
 * @date 2020/04/18
 */
public interface AbstractFactory {
    /**
     * 获取产品A实例
     *
     * @return 产品A的实例
     */
    ProductA createProductA();

    /**
     * 获取产品B实例
     *
     * @return 产品B的实例
     */
    ProductB createProductB();
}
