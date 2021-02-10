package mrpighead.teach.MethodReference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 父类的方法引用
 */
public class SuperMethodDemo extends TheSuperClass {

    /**
     * 通过调用父类的方法达到同样的效果
     */
    @Test
    public void demo() {
        // 创建一个链表(不是数组或列表Array, 链表是可扩展的)
        List<String> list = Arrays.asList("Hello ", "world", "!");
        // 对链表list每一项循环执行super.print(java.lang.String)
        list.forEach(super::print);
    }
}

class TheSuperClass {

    /**
     * 打印x 注意: 没有static静态修饰
     * @param x 打印的内容
     */
    public void print(String x) {
        System.out.print(x);
    }
}
