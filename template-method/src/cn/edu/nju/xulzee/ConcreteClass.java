package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/28
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation3() {
        System.out.println("Third Primitive Operation in Concrete Class ");
    }

    @Override
    protected void primitiveOperation4() {
        System.out.println("Fourth Primitive Operation in Concrete Class ");
    }
}
