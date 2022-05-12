package com.example.hierarchicaldatainrdbms.adjacencylist.resource;

import com.example.hierarchicaldatainrdbms.adjacencylist.entity.AdjacencyListCommentEntity;
import com.example.hierarchicaldatainrdbms.adjacencylist.repository.AdjacencyListCommentRepository;
import com.example.hierarchicaldatainrdbms.common.dto.req.CommentAddReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * - 添加节点
 * - 删除节点
 * - 移动节点
 * - 查询节点
 * - 还原树结构
 */
@RestController
@RestControllerAdvice
@RequestMapping("/adjacencyList/comments")
@RequiredArgsConstructor
public class AdjacencyListCommentResource {

    private final AdjacencyListCommentRepository commentRepository;

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody CommentAddReq req) {
        AdjacencyListCommentEntity.node(req.getParentId(), req.getAuthor(), req.getComment())
    }

}
