package cn.edu.nju.xulzee;

/**
 * 定义Product工厂接口
 *
 * @author xulzee
 * @date 2020/04/13

 */
public interface Creator {
    /**
     * 创建Product
     *
     * @return Product实例
     */
    Product createProduct();
}
