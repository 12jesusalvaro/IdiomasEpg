
package com.epg.dao;

import com.epg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserDao extends JpaRepository<User, Long> {
    
}
