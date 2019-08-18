package dev.daqiang.blog.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Post extends BaseEntity {
    private Long id;

    private String postName;

    private String context;
}
