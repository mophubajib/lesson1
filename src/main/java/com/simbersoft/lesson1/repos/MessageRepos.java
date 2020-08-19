package com.simbersoft.lesson1.repos;


import org.springframework.data.repository.CrudRepository;
import  com.simbersoft.lesson1.accessingdatamysql.Message;

import java.util.List;


public interface MessageRepos extends CrudRepository< Message, Integer> {
    List<Message> findByTag(String tag);
}