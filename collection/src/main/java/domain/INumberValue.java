package domain;

/**
 * @author zhanglei211 on 2021/11/29.
 */
public interface INumberValue<T extends Number> {
    T value();

    boolean isSame(T status);
}
