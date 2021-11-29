package domain;

/**
 * @author zhanglei211 on 2021/11/29.
 */
public enum ItemTypeEnum implements INumberValue<Short> {

    //@formatter:off
    APPLE((short) 0, "苹果"),
    BANANA((short) 1, "香蕉");
    //@formatter:on

    private Short value;
    private String desc;

    ItemTypeEnum(Short value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String desc() {
        return desc;
    }

    @Override
    public Short value() {
        return value;
    }

    @Override
    public boolean isSame(Short status) {
        return status.equals(value);
    }
}