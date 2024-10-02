package dbp.proyecto.user.domain;

import dbp.proyecto.comment.domain.Comment;
import dbp.proyecto.post.domain.Post;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    @NotNull
    private Role role;

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10, max = 32)
    private String password;

    @NotNull
    private LocalDate birthDate;

    private LocalDateTime createdAt;

    @ManyToMany(mappedBy = "user")
    private List<User> followers;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "users")
    private List<Comment> comments;



}
