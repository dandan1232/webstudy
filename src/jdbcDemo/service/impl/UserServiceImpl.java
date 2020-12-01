package jdbcDemo.service.impl;

import jdbcDemo.bean.User;
import jdbcDemo.dao.UserDao;
import jdbcDemo.factory.DaoFactory;
import jdbcDemo.service.UserService;

import java.sql.SQLException;

/**
 * @author 蛋宝
 * @date 2020/11/22 16:05
 * @description UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    @Override
    public int addUser(User user) throws SQLException {
        int effectLine= DaoFactory.getUserDaoInstance().addUser(user);
        return effectLine;
    }

    @Override
    public String getHead(String name) throws Exception {
        String head = DaoFactory.getUserDaoInstance().getHead(name);
        return head;
    }


    @Override
    public boolean getUser(String name, String password) throws SQLException {
        boolean flag=DaoFactory.getUserDaoInstance().getUser(name,password);
        return flag;
    }
}
