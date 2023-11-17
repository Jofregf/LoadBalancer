package app.portfoliojofregf.vercel.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PostDTO {
    private Long id;
    private String title;
    private Long user_id;
}
