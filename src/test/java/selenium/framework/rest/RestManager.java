package selenium.framework.rest;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import selenium.project.model.MyPost;

public class RestManager {

    private static final String METHOD_POSTS = "/posts";
    private static final String METHOD_USERS = "/users";

    public static HttpResponse<JsonNode> getPostById (int id) {
        HttpResponse<JsonNode> response = Unirest.get(METHOD_POSTS + "/" + id).asJson();
        return response;


    }

    public static HttpResponse<JsonNode> getUserById (int id) {
        HttpResponse<JsonNode> response = Unirest.get(METHOD_USERS + "/" + id).asJson();
        return response;


    }

    public static HttpResponse<JsonNode> getUserAll () {
        HttpResponse<JsonNode> response = Unirest.get(METHOD_USERS).asJson();
        return response;
    }

    public static HttpResponse<JsonNode> getPostAll () {
        HttpResponse<JsonNode> response = Unirest.get(METHOD_POSTS).asJson();
        return response;
    }

    public static HttpResponse<JsonNode> sendMyPost(MyPost myPost) {
        return Unirest.post(METHOD_POSTS)
                .field("id", myPost.getId())
                .field("body", myPost.getBody())
                .field("title", myPost.getTitle())
                .field("userId", String.valueOf(myPost.getUserId())).asJson();
    }

    public static HttpResponse<JsonNode> sendMyPostByText(String object) {
        return Unirest.post(METHOD_POSTS).body(object).asJson();

    }




}
