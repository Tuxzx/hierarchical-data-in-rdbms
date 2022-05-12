package com.example.hierarchicaldatainrdbms.adjacencylist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * 邻接表评论 Entity
 * <p>
 * - 每个节点只知道其直接父节点
 *
 * @author TuXiazixin
 */
@Entity
@Getter
@Setter
public class AdjacencyListCommentEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Long parentId;

    private String author;

    private String comment;

    /**
     * 根节点
     *
     * @param author  author
     * @param comment comment
     * @return node
     */
    public static AdjacencyListCommentEntity rootNode(String author, String comment) {
        AdjacencyListCommentEntity node = new AdjacencyListCommentEntity();
        node.author = author;
        node.comment = comment;
        return node;
    }

    /**
     * 非根节点
     *
     * @param parentId parentId
     * @param author   author
     * @param comment  comment
     * @return node
     */
    public static AdjacencyListCommentEntity node(Long parentId, String author, String comment) {
        AdjacencyListCommentEntity node = new AdjacencyListCommentEntity();
        node.parentId = parentId;
        node.author = author;
        node.comment = comment;
        return node;
    }

}
