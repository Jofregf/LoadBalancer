package app.portfoliojofregf.vercel.usersservice.dto;

import java.util.List;

public record UserRecord(Long id, String name, String lastname, String cellphone, List<PostDTO>postsList){

}
