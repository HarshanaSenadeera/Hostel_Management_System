package lk.ijse.hibernate.bo.custom;

import lk.ijse.hibernate.dto.LoginDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserBO {

    ArrayList<LoginDTO> getAllUsers() throws SQLException, ClassNotFoundException;

    ArrayList<LoginDTO> searchAllUser(String id) throws SQLException, ClassNotFoundException;

    boolean saveUser(LoginDTO dto) throws SQLException, ClassNotFoundException;

    boolean updateUser(LoginDTO dto) throws SQLException, ClassNotFoundException;

    boolean deleteUser(String id) throws SQLException, ClassNotFoundException;

    boolean existUser(String id) throws SQLException, ClassNotFoundException;
}
