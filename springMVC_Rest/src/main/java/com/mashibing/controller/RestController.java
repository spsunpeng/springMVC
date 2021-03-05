package com.mashibing.controller;

import com.mashibing.dao.UserDao;
import com.mashibing.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sunpeng
 * @Date 2021-02-19 14:16
 */
@Controller
public class RestController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insert(){
        userDao.insert(new User());
        return "success";
    }

    //未成功
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String update(){
        userDao.update(1);
        return "success";
    }

    //未成功
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        userDao.delete(1);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String query(){
        userDao.query();
        return "success";
    }

}


