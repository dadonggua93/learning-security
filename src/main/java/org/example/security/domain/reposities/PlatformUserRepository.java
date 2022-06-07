package org.example.security.domain.reposities;

import org.example.security.domain.entity.PlatformUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformUserRepository extends JpaRepository<PlatformUser,Long> {

    PlatformUser queryTopByUsername(String username);

}
