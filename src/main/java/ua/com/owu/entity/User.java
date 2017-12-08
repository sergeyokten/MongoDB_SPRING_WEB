package ua.com.owu.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Indexed;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    private ObjectId id;

    @Indexed
    private String username;
    //......


}
