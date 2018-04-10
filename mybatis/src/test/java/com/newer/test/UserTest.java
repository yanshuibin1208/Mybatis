package com.newer.test;

import com.newer.dao.UserDao;
import com.newer.pojo.User;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void test1(){
        User user=new User();
        user.setSname("段誉");
        user.setSsex("男");
        user.setCid("001");

        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);
        System.out.println(dao.addUser(user));
        //增删改要提交一下
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void findById(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);
        User user=dao.findById(2);
        System.out.println(user.getSname());
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void findAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);
        List<User> users=dao.findAll();
        System.out.println(users.get(1).getSname());
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
