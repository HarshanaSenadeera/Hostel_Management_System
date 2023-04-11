package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.entity.Reservation;

import java.sql.SQLException;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public interface ReserveDAO extends CrudDAO<Reservation, String> {

    String generateNewId() throws SQLException, ClassNotFoundException;

    boolean existStudent(String id) throws SQLException, ClassNotFoundException;
}
