package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.entity.Loging;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public interface UserDAO extends CrudDAO<Loging, String> {

    ArrayList<Loging> getAllUsers() throws SQLException, ClassNotFoundException;
}
