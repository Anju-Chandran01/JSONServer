package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class JSONServer {

    // posts
    @Test
    public void createPosts(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",3);
        json.put("title","RestAssured-test");
        json.put("author","John..");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/posts/");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void getAllPosts(){

        Response response = RestAssured.get("http://localhost:3000/posts/");

        System.out.println("Body : " + response.body().asPrettyString());
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response time : " + response.getTime());
    }
    @Test
    public void putPosts(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",4);
        json.put("title","Test");
        json.put("author","Anju....");
        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/posts/2");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void patchPosts(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("title","API Testing");
        request.body(json.toJSONString());
        Response response = request.patch("http://localhost:3000/posts/2");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void deletePosts(){
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/2");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }

    // comments

    @Test
    public void createComments(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",2);
        json.put("body","Nice");
        json.put("postId","1");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/comments/");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void getAllComments(){

        Response response = RestAssured.get("http://localhost:3000/comments/");

        System.out.println("Body : " + response.body().asPrettyString());
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response time : " + response.getTime());
    }
    @Test
    public void putComments(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",2);
        json.put("body","Awesome");
        json.put("postId","2");
        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/comments/1");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void patchComments(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("body","Excellent");
        request.body(json.toJSONString());
        Response response = request.patch("http://localhost:3000/comments/1");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
    @Test
    public void deleteComments(){
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/comments/1");
        System.out.println("Status code : " + response.statusCode());
        System.out.println("Response body : " + response.body().asPrettyString());
    }
}
