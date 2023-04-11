package lk.ijse.hibernate.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public interface CrudDAO <T, ID> extends SuperDAO {

    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    boolean save(T t) throws SQLException, ClassNotFoundException;

    boolean update(T t) throws SQLException, ClassNotFoundException;

    boolean delete(ID id) throws SQLException, ClassNotFoundException;

    T search(ID id) throws SQLException, ClassNotFoundException;

    boolean exist(ID id) throws SQLException, ClassNotFoundException;
}
