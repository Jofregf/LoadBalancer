package app.portfoliojofregf.vercel.usersservice.repository;

import app.portfoliojofregf.vercel.usersservice.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="posts-service")

public interface IPostAPI {

    @GetMapping("/api/posts/{user_id}")
    public List<PostDTO> getPostByUserId(@PathVariable("user_id") Long user_id);
}
