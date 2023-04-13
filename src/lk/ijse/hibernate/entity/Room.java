package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room {

    @Id
    @Column(columnDefinition = "VARCHAR(200)")
    private String room_id;
    private String type;
    private String key_money;
    private int qty;

    @OneToMany(mappedBy = "room_id", fetch = FetchType.EAGER)
    private List<Reservation> roomDetails = new ArrayList<>();


    public Room(String room_id, String type, String key_money, int qty) {
        this.room_id = room_id;
        this.type = type;
        this.key_money = key_money;
        this.qty = qty;
    }
}
