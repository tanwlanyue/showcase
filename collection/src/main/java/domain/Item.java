package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanglei211 on 2021/11/29.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    int id;
    ItemTypeEnum itemTypeEnum;


}
