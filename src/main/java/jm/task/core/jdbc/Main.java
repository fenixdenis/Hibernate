package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;


import java.util.List;


public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("IVAN", "IVANOV", (byte) 33);
        userDao.saveUser("EVA", "IVANOVSKAYA", (byte) 20);
        userDao.saveUser("DEN", "DOBRINOV", (byte) 45);
        userDao.saveUser("MARI", "PETROVA", (byte) 22);

        List<User> users = userDao.getAllUsers();
            for (User user : users) {
            System.out.println(user);
            }
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }}