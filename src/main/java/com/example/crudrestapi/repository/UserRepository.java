package com.example.crudrestapi.repository;

import com.example.crudrestapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * @author KAMSAN TUTORIAL
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>, JpaRepository<UserEntity, Long> {
}
