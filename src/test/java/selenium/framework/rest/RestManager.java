package selenium.framework.rest;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

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



}
