package mrpighead.teach.MethodReference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 对象的方法引用
 */
public class ObjectMethodDemo {

    /**
     * 对象是自己(this)
     */
    @Test
    public void demo1() {
        // 创建一个链表(不是数组或列表Array, 链表是可扩展的)
        List<String> list = Arrays.asList("Hello ", "world", "!");
        // 对链表list每一项循环执行this.print(java.lang.String)
        list.forEach(this::print);
    }

    /**
     * 对象是新的实例
     */
    @Test
    public void demo2() {
        // 创建一个链表(不是数组或列表Array, 链表是可扩展的)
        List<String> list = Arrays.asList("Hello ", "world", "!");
        // 对链表list每一项循环执行System.out.print(java.lang.String)
        // 注意: System.out是一个对象
        list.forEach(new ObjectMethodDemo()::print);
    }

    /**
     * 对象是控制台输出流(System.out)
     */
    @Test
    public void demo3() {
        // 创建一个链表(不是数组或列表Array, 链表是可扩展的)
        List<String> list = Arrays.asList("Hello ", "world", "!");
        // 对链表list每一项循环执行System.out.print(java.lang.String)
        // 注意: System.out是一个对象
        list.forEach(System.out::print);
    }

    /**
     * 打印x 注意: 没有static静态修饰
     * @param x 打印的内容
     */
    public void print(String x) {
        System.out.print(x);
    }
}
