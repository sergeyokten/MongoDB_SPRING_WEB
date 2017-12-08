package ua.com.owu.configs;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDBCOnfig {


    @Bean
    public MongoClient mongoClient() {
//        return new MongoClient("localhost" ,27017);
        return new MongoClient();
    }

    @Bean
    public Morphia morphia() {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ua.com.owu.entity");
        return morphia;
    }

    @Bean
    public Datastore datastore(Morphia morphia) {
        Datastore datastore = morphia.createDatastore(mongoClient(), "mongoprepeare_spring_web");
        return datastore;
    }
}
