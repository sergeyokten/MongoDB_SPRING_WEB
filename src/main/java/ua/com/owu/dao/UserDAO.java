package ua.com.owu.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.owu.entity.User;

import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private Datastore datastore;

    public void save(User user) {
        datastore.save(user);
    }

    public List<User> findAll() {
        return datastore.find(User.class).asList();
    }

    public List<User> findAllWithQuery() {

        Query<User> userQuery = datastore.createQuery(User.class);
        userQuery.filter("id >=", 10);
        List<User> users = userQuery.asList();
        return users;

    }
}

