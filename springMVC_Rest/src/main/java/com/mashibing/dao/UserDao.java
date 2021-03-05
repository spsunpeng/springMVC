package com.mashibing.dao;

import com.mashibing.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author sunpeng
 * @Date 2021-02-19 14:17
 */
@Repository
public class UserDao {

    public void query(){
        System.out.println("query");
    }
    public void delete(int id){
        System.out.println("delete");
        System.out.println(id);
    }
    public void update(int id){
        System.out.println("update");
        System.out.println(id);
    }
    public void insert(User user){
        System.out.println("insert");
        System.out.println(user);
    }

}
