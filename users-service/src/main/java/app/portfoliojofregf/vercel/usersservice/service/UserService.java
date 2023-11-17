package app.portfoliojofregf.vercel.usersservice.service;

import app.portfoliojofregf.vercel.usersservice.dto.PostDTO;
import app.portfoliojofregf.vercel.usersservice.dto.UserDTO;
import app.portfoliojofregf.vercel.usersservice.model.User;
import app.portfoliojofregf.vercel.usersservice.repository.IPostAPI;
import app.portfoliojofregf.vercel.usersservice.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IPostAPI postAPI;

    @Override
    public UserDTO getUserAndPosts(Long user_id) {
        User user = userRepository.findById(user_id).orElseThrow(null);
        List<PostDTO> postsList = postAPI.getPostByUserId(user_id);
        UserDTO userDTO = new UserDTO(user.getUser_id(), user.getName(), user.getLastname(), user.getCellphone(), postsList);

        return userDTO;
    }
}
