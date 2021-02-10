package mrpighead.teach.MethodReference;

import org.junit.Test;

/**
 * 构造器的方法引用
 */
public class NewMethodDemo {

    /**
     * 通过NewInterface达到同样的效果
     */
    @Test
    public void demo() {
        // creator的create(x) -> NewMethodDemo.new(x)
        NewInterface creator = DemoClass::new;
        DemoClass object = creator.create("Hello world!");
        System.out.println(object.x);
    }
}

/**
 * 用于测试的类
 */
class DemoClass {

    public String x;

    /**
     * 构造器(返回类型就是这个类本身)
     */
    public DemoClass(String x) {
        this.x = x;
    }
}

/**
 * 这是一个函数接口(只有一个方法)
 */
interface NewInterface {

    /**
     * NewMethodDemo构造器
     */
    DemoClass create(String x);
}
