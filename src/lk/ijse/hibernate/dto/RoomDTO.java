package lk.ijse.hibernate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {

    private String room_type_id;
    private String type;
    private String key_money;
    private int qty;
}
