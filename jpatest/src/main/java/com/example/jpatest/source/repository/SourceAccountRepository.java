package com.example.jpatest.source.repository;

import com.example.jpatest.domain.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts") // 이게 뭘까
public interface SourceAccountRepository extends JpaRepository<Accounts, Long> {
}
