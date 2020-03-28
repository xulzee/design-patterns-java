package cn.edu.nju.xulzee;

/**
 * @author xulzee
 * @date 2020/03/28
 */
public abstract class AbstractClass {
    public void templateMethod(){
        // ...
        primitiveOperation1();
        // ...
        primitiveOperation2();
        // ...
        primitiveOperation3();
        // ...
        primitiveOperation4();
    }

    protected void primitiveOperation1(){
        System.out.println("First Primitive Operation in Abstract Class ");
    }

    protected void primitiveOperation2(){
        System.out.println("Second Primitive Operation in Abstract Class ");
    }

    /**
     * implement by subclass
     */
    protected abstract void primitiveOperation3();

    /**
     * implement by subclass
     */
    protected abstract void primitiveOperation4();

}
