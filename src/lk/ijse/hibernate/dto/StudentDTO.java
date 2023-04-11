package lk.ijse.hibernate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private String student_id;
    private String name;
    private String address;
    private String contact_no;
    private LocalDate dob;
    private String gender;
}
