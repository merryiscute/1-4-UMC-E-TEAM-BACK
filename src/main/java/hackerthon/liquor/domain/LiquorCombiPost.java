package hackerthon.liquor.domain;


import hackerthon.liquor.domain.common.BaseEntity;
import hackerthon.liquor.domain.mapping.LiquorCombi;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class LiquorCombiPost extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "liquorCombiPost", cascade = CascadeType.ALL)
    private List<Comment> commentList = new ArrayList<>();

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false, length = 40)
    private String contents;

    private Integer likes;

    @Column(nullable = false, length = 40)
    private String picture;






}