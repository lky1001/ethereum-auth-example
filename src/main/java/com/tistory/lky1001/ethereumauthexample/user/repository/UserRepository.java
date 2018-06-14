package com.tistory.lky1001.ethereumauthexample.user.repository;

import com.tistory.lky1001.ethereumauthexample.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
