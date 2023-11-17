package app.portfoliojofregf.vercel.usersservice.service;

import app.portfoliojofregf.vercel.usersservice.dto.UserDTO;

public interface IUserService {
    public UserDTO getUserAndPosts(Long user_id);
}
