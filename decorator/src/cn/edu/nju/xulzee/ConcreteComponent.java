package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/02
 * <p>
 * Concrete Component
 * 定义了可以被附加责任的对象
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Concrete Component operation");
    }
}
