package cn.edu.nju.xulzee;

/**
 * @date 2020/04/12
 * @author xulzee
 * 定义了抽象部分的基类
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 定义了抽象类的接口
     */
    public abstract void operation();
}
