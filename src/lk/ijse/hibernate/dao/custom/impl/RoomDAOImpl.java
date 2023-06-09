package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.RoomDAO;
import lk.ijse.hibernate.entity.Room;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public class RoomDAOImpl implements RoomDAO{
        @Override
        public ArrayList<Room> getAll() throws SQLException, ClassNotFoundException {
      ArrayList<Room> allRoom;
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Room");
            allRoom = (ArrayList<Room>) query.list();
            transaction.commit();
            session.close();
            return allRoom;
        }

        @Override
        public boolean save(Room room) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            session.save(room);
            transaction.commit();
            session.close();
            return true;
        }

        @Override
        public boolean update(Room room) throws SQLException, ClassNotFoundException {

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            session.update(room);
            transaction.commit();
            session.close();
            return true;
        }

        @Override
        public boolean delete(String id) throws SQLException, ClassNotFoundException {

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Room room = session.get(Room.class, id);
            session.delete(room);
            transaction.commit();
            session.close();
            return true;
        }

        @Override
        public Room search(String id) throws SQLException, ClassNotFoundException {

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Room room = session.get(Room.class, id);
            transaction.commit();
            session.close();
            return room;
        }

        @Override
        public boolean exist(String id) throws SQLException, ClassNotFoundException {

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("SELECT room_id FROM Room WHERE room_id=:id");
            String id1 = (String) query.setParameter("id", id).uniqueResult();
            if (id1 != null) {
                return true;
            }
            transaction.commit();
            session.close();
            return false;
        }
}
