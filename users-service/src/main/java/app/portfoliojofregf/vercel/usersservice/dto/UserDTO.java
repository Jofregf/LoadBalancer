package app.portfoliojofregf.vercel.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class UserDTO {
    private Long id;
    private String name;
    private String lastname;
    private String cellphone;
    private List<PostDTO> postsList;
}
