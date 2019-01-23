package webflux.reactiveweb;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Profile {

    @Id
    private String id;

    private String email;

    public Profile(String id, String email) {
        this.id = id;
        this.email = email;
    }
}

