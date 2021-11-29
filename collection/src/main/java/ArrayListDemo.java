import domain.Item;
import domain.ItemTypeEnum;

import java.util.ArrayList;

/**
 * @author zhanglei211 on 2021/11/23.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Item item = new Item(1, ItemTypeEnum.APPLE);
        list.add(item);
        // 依赖对象的equals方法判断
        if (list.contains(item)) {
            System.out.println("exist apple");
        }
    }
}
