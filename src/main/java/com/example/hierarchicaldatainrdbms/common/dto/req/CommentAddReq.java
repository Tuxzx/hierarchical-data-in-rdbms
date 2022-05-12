package com.example.hierarchicaldatainrdbms.common.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CommentAddReq {

    @Schema(required = false)
    private Long parentId;

    private String author;

    private String comment;
}
