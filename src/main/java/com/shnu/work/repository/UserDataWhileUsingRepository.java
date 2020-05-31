package com.shnu.work.repository;

import com.shnu.work.entity.UserDataWhileUsingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataWhileUsingRepository extends CrudRepository<Integer, UserDataWhileUsingEntity> {
}