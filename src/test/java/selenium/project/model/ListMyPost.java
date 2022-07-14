package selenium.project.model;

import java.util.List;

public class ListMyPost {
    private List<MyPost> myPostList;
    public ListMyPost(List<MyPost> myPostList) {
        this.myPostList = myPostList;
    }

    public List<MyPost> getMyPostList() {
        return myPostList;
    }


    }

