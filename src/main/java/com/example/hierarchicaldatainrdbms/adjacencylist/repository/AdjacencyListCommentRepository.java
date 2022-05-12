package com.example.hierarchicaldatainrdbms.adjacencylist.repository;

import com.example.hierarchicaldatainrdbms.adjacencylist.entity.AdjacencyListCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdjacencyListCommentRepository extends JpaRepository<AdjacencyListCommentEntity, Long> {
}
