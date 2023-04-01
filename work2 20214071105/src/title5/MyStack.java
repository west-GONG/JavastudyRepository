package title5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyStack<E> {
    private LinkedList<E> list = new LinkedList<E>();

    // 测试堆栈是否为空
    public boolean empty() {
        return list.isEmpty();
    }

    // 查看堆栈项部的对象，但不从堆栈中移除它
    public E peek() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        return list.getLast();
    }

    // 删除此堆栈顶部的对象，并将该对象作为此西数的值返回
    public E pop() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        return list.removeLast();
    }

    // 将元素推入栈中
    public E push(E item) {
        list.add(item);
        return item;
    }
}
