package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/04/12
 * 抽象类的实现类
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.action();
    }
}
