import domain.Item;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zhanglei211 on 2021/11/4.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // linkLast
        list.add("1");
        // linkFirst
        list.addFirst("2");
        // linkLast
        list.addLast("3");
        // linkLast
        list.add("4");
        // 2 1 3 4
        // unlinkFirst
        String s1 = list.removeFirst();
        System.out.println("2".equals(s1));
        // unlinkLast
        String s2 = list.removeLast();
        System.out.println("4".equals(s2));
        // removeFirst
        String s3 = list.remove();
        System.out.println("1".equals(s3));

        // 不推荐 遍历次数1+2+3+4+5+...
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // LinkedList遍历推荐迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 迭代器增删不会抛异常
        // 集合自带的方法进行增删，会抛出异常
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.remove();
            listIterator.add("5");
        }

        // recommend
        LinkedList<Item> items = new LinkedList<Item>();
        Iterator<Item> iterator1 = items.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
