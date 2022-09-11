package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class JSONServerBDD {
    // posts
    @Test
    public void getAllPosts(){
        RestAssured
                .given()
                .get("http://localhost:3000/posts/")
                .then().statusCode(200);
    }
    @Test
    public void createPosts(){
        JSONObject json = new JSONObject();
        json.put("id",5);
        json.put("title","RestAssured-test");
        json.put("author","John..");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .post("http://localhost:3000/posts/")
                .then().statusCode(201);
    }
    @Test
    public void putPosts(){
        JSONObject json = new JSONObject();
        json.put("id",4);
        json.put("title","Test");
        json.put("author","Anju....");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .put("http://localhost:3000/posts/2")
                .then().statusCode(200);
    }
    @Test
    public void patchPosts(){
        JSONObject json = new JSONObject();
        json.put("title","Testing..");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .patch("http://localhost:3000/posts/2")
                .then().statusCode(200);
    }
    @Test
    public void deletePosts(){
        RestAssured
                .given()
                .delete("http://localhost:3000/posts/2")
                .then().statusCode(200);
    }
    // comments
    @Test
    public void getAllComments(){
        RestAssured
                .given()
                .get("http://localhost:3000/comments/")
                .then().statusCode(200);
    }
    @Test
    public void createComments(){
        JSONObject json = new JSONObject();
        json.put("id",1);
        json.put("title","RestAssured-test");
        json.put("author","John..");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .post("http://localhost:3000/comments/")
                .then().statusCode(201);
    }
    @Test
    public void putComments(){
        JSONObject json = new JSONObject();
        json.put("id",4);
        json.put("title","Test");
        json.put("author","Anju....");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .put("http://localhost:3000/comments/2")
                .then().statusCode(200);
    }
    @Test
    public void patchComments(){
        JSONObject json = new JSONObject();
        json.put("title","Testing..");
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(json.toJSONString())
                .when()
                .patch("http://localhost:3000/comments/2")
                .then().statusCode(200);
    }
    @Test
    public void deleteComments(){
        RestAssured
                .given()
                .delete("http://localhost:3000/comments/2")
                .then().statusCode(200);
    }
}
