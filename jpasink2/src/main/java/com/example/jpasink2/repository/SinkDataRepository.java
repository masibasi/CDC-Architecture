package com.example.jpasink2.repository;

import com.example.jpasink2.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "data") // 이게 뭘까
public interface SinkDataRepository extends JpaRepository<Data, Long> {
}
