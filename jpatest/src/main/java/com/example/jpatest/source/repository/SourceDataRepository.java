package com.example.jpatest.source.repository;

import com.example.jpatest.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "data") // 이게 뭘까
public interface SourceDataRepository extends JpaRepository<Data, Long> {
}
