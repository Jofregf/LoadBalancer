package app.portfoliojofregf.vercel.usersservice.controller;

import app.portfoliojofregf.vercel.usersservice.dto.UserDTO;
import app.portfoliojofregf.vercel.usersservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserAndPost(@PathVariable Long user_id){
        UserDTO user = userService.getUserAndPosts(user_id);
        return user;
    }
}
