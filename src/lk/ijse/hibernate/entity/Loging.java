package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loging {

    private String userID;
    private String name;
    private String address;
    private String contact_no;
    private String Password;
    private String gender;
}
