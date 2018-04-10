package com.newer.test;

import com.newer.dao.AuthorDao;
import com.newer.pojo.Author;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AuthorTest {
    @Test
    public void addAuthor(){
        Author author=new Author();
        author.setName("李白");
        author.setSex("男");
        author.setBirthday("1778-02-23");
        author.setPhone("13788888888");

        Author author1=new Author();
        author1.setName("三少");
        author1.setSex("男");
        author1.setBirthday("1988-07-23");
        author1.setAddress("上海");
        author1.setPhone("13788878888");

        Author author2=new Author();
        author2.setName("三毛");
        author2.setSex("女");
        author2.setBirthday("1775-05-23");
       author2.setAddress("广东");

        Author author3=new Author();
        author3.setName("李商隐");
        author3.setSex("女");
        author3.setAddress("湖南");
        author3.setPhone("13766666666");
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.addAuthor(author)+dao.addAuthor(author1)+dao.addAuthor(author2)+dao.addAuthor(author3));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findById(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        Author author=dao.findById(2);
        System.out.println(author.getAddress());
        sqlSession.close();
    }

    @Test
    public void findAll(){
      SqlSession sqlSession=SqlSessionUtil.getSqlSession();
      AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        List<Author>authors=dao.findAll();
        System.out.println(authors.get(0).getName());
        sqlSession.close();
    }

    @Test
    public  void deleteAuthor(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.deleteAuthor(4));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateAuthor(){
        Author author=new Author();
        author.setId(4);
        author.setBirthday("1956-08-25");
        author.setAddress("北京");
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.updateAuthor(author));
        sqlSession.commit();
        sqlSession.close();
    }

}
