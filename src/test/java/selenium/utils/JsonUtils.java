package selenium.utils;

import com.google.gson.Gson;
import kong.unirest.json.JSONArray;
import org.apache.commons.io.FileUtils;
import selenium.project.model.MyPost;
import selenium.project.model.MyUser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    private static Gson gson = new Gson();

    public static MyPost createMyPostByJson(String text) {
        MyPost myPost = gson.fromJson(text, MyPost.class);
        return myPost;

    }

    public static List<MyPost> getListMyPosts(JSONArray array){
        List<MyPost> result = new ArrayList<>();
        for (int i = 0; i <array.length(); i++) {
            MyPost myPost = createMyPostByJson(array.get(i).toString());
            result.add(myPost);

        }
        return result;
    }

    public static MyUser createMyUserByJson(String text) {
        MyUser myUser = gson.fromJson(text, MyUser.class);
        return myUser;
    }

    public static <T> T createObject (String path, Class<T> clazz) {
        String jsonText = null;
        try {
            jsonText = FileUtils.readFileToString(new File(path), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(jsonText, clazz);
    }
}
