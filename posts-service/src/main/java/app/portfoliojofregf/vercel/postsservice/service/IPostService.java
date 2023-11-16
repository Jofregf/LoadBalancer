package app.portfoliojofregf.vercel.postsservice.service;

import app.portfoliojofregf.vercel.postsservice.model.Post;

import java.util.List;

public interface IPostService {
    public List<Post> getPostByUser(Long user_id);
}
