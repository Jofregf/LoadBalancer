package app.portfoliojofregf.vercel.postsservice.controller;

import app.portfoliojofregf.vercel.postsservice.model.Post;
import app.portfoliojofregf.vercel.postsservice.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private IPostService postService;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/{user_id}")
    public List<Post> getPostByUserId(@PathVariable Long user_id){
        System.out.println("------- Estoy en el puerto " + serverPort);
        return postService.getPostByUser(user_id);
    }
}

// DEJE EL VIDEO EN 18:23