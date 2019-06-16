package com.qushoping.opapi.repository;

import com.qushoping.opapi.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yinguilong
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
