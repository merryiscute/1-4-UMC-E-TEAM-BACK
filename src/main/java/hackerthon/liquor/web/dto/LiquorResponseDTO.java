package hackerthon.liquor.web.dto;

import hackerthon.liquor.domain.Comment;
import hackerthon.liquor.validation.anotation.ExistPost;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

public class LiquorResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class liquorDetailDTO{
        Long Liquor_Id;
        String name;
        String percent;
        String price;
        String volume;
        String description;
        String tag;
        String picture;

        List<liquorCombiPostDTO> liquorCombiPostDTOList;
        List<liquorFoodPostDTO> liquorFoodPostDTOList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class liquorCombiPostDTO{
        Long id;
        String title;
        String contents;
        Integer likes;
        String picture;
        String tag;

        List<commentDTO> commentList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class liquorFoodPostDTO{
        Long id;
        String title;
        String contents;
        Integer likes;
        String picture;
        String tag;

        List<commentDTO> commentList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class commentDTO{
        Integer writer;
        String contents;
        String tag;
    }
}
