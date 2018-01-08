package models;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

/**
 * Created by Guest on 1/8/18.
 */
public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>();

    public Post (String content){
        this.content = content;
        instances.add(this);
    }

    public String getContent (){
        return content;

    }

    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
}
