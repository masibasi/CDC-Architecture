package com.example.jpasink.repository;

import com.example.jpasink.domain.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts") // 이게 뭘까
public interface SinkAccountRepository extends JpaRepository<Accounts, Long> {
}
