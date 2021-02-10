package mrpighead.teach.MethodReference;

import java.util.*;
import org.junit.Test;

/**
 * 静态方法引用
 * static
 */
public class StaticMethodDemo {

    /**
     * 打印出"Hello ""world""!"
     */
    @Test
    public void demo() {
        // 创建一个链表(不是数组或列表Array, 链表是可扩展的)
        List<String> list = Arrays.asList("Hello ", "world", "!");
        // 对链表list每一项循环执行StaticMethodDemo.print(java.lang.String)
        list.forEach(StaticMethodDemo::print);
    }

    /**
     * 打印x
     * @param x 打印的内容
     */
    public static void print(String x) {
        System.out.print(x);
    }
}
