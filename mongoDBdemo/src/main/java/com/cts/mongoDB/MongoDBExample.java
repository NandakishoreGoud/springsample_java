package com.cts.mongoDB;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by cts1 on 11/10/17.
 */
public class MongoDBExample {
    public static void main(String[] args) throws UnknownHostException {

// Creating a Mongo client
/*
        MongoClient mongoClient = new MongoClient("localhost",27017);

        DB database = mongoClient.getDB("ctscustomers");
        database.createCollection("hero",null);
        database.createCollection("heroine",null);

        database.getCollectionNames().forEach(System.out::println);
        DBCollection collection = database.getCollection("heroine");*/
        MongoClient mongoClient = new MongoClient("localhost",27017);
        DB database = mongoClient.getDB("oracle");
        database.createCollection("myoracle",null);
        mongoClient.getDatabaseNames().forEach(System.out::println);
        database.getCollectionNames().forEach(System.out::println);


        /*Document document = new Document("title", "MongoDB")
                .append("id", 1)
                .append("description", "database")
                .append("likes", 100)
                .append("url", "http://www.tutorialspoint.com/mongodb/")
                .append("by", "tutorials point");
        collection.insertOne(document);
        System.out.println("Document inserted successfully");
*/





    /*    MongoClient mongoClient = new MongoClient("localhost",27017);
        DB database = mongoClient.getDB("myMongoDb");
        mongoClient.getDatabaseNames().forEach(System.out::println);
        database.createCollection("customers", null);
        database.getCollectionNames().forEach(System.out::println);
        //DBCollection collection = database.getCollection("customers");

        /*BasicDBObject document = new BasicDBObject();
        document.put("name", "Shubham");
        document.put("company", "Baeldung");
        collection.insert(document);
        BasicDBObject query = new BasicDBObject();
        query.put("name", "Shubham");
 
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", "John");
 
        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument);
 
        collection.update(query, updateObject);



*//*
        *//*User user = createUser();
        DBObject doc = createDBObject(user);
        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("MongoDemo");
        DBCollection col = db.getCollection("users");
        //create user
        WriteResult result = col.insert(doc);
        System.out.println(result.getUpsertedId());
        System.out.println(result.getN());
        System.out.println(result.isUpdateOfExisting());
        System.out.println(result.getLastConcern());
//read example
        DBObject query = BasicDBObjectBuilder.start().add("_id", user.getId()).get();
        DBCursor cursor = col.find(query);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        //update example

        user.setName("Pankaj Kumar");
        doc = createDBObject(user);
        result = col.update(query, doc);
        System.out.println(result.getUpsertedId());
        System.out.println(result.getN());
        System.out.println(result.isUpdateOfExisting());
        System.out.println(result.getLastConcern());

        //delete example
        result = col.remove(query);
        System.out.println(result.getUpsertedId());
        System.out.println(result.getN());
        System.out.println(result.isUpdateOfExisting());
        System.out.println(result.getLastConcern());

        //close resources
        mongo.close();
    }

    private static DBObject createDBObject(User user) {
        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();

        docBuilder.append("_id", user.getId());
        docBuilder.append("name", user.getName());
        docBuilder.append("role", user.getRole());
        docBuilder.append("isEmployee", user.isEmployee());
        return docBuilder.get();
    }

    private static User createUser() {
        User u = new User();
        u.setId(2);
        u.setName("Pankaj");
        u.setEmployee(true);
        u.setRole("CEO");
        return u;
*/
    }
}
