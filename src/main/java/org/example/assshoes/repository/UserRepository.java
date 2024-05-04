package org.example.assshoes.repository;

import org.example.assshoes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByFullname(String fullname);

    User findByFullname(String fullname);
}
