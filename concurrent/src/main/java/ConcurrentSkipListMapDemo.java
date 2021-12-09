import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author zhanglei211 on 2021/12/9.
 */
public class ConcurrentSkipListMapDemo {
    /**
     * 如果对数据有强一致要求，则需使用Hashtable； </br>
     * 在大部分场景通常都是弱一致性的情况下，数据量小，查询操作频繁，使用ConcurrentHashMap即可； ConcurrentHashMap中的get、size等方法没有用到锁</br>
     * 如果数据量大，且存在大量增删改操作，则可以考虑使用ConcurrentSkipListMap。
     * 
     * @param args
     */
    public static void main(String[] args) {
        ConcurrentSkipListMap<Object, Object> map = new ConcurrentSkipListMap<>();
        map.put("", "");
    }
}
