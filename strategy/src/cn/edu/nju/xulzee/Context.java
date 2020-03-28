package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/28
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void callStrategy() {
        this.strategy.algorithm();
    }
}
