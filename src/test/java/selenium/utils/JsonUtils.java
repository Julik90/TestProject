package selenium.utils;

import com.google.gson.Gson;
import selenium.project.model.MyPost;

public class JsonUtils {

    private static Gson gson = new Gson();

    public static MyPost createMyPostByJson(String text) {
        MyPost myPost = gson.fromJson(text, MyPost.class);
        return myPost;

    }
}
