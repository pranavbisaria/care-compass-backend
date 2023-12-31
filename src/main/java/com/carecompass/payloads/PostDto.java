package com.carecompass.payloads;

import com.carecompass.models.Category;
import com.carecompass.models.Images;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long Id;
    private List<Images> postImage = new ArrayList<>();
    private String description;
    private Category category;
    private Long likesCount = 0L;
    private Long commentCount = 0L;
    private String postedOn;
    private UserShow user;
    private Boolean ifLiked = false;
}
