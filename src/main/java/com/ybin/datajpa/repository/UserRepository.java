package com.ybin.datajpa.repository;

import com.ybin.datajpa.entity.User;
import com.ybin.support.jpa.StandardRepository;

//继承JpaRepository来完成对数据库的操作
//@Repository
public interface UserRepository extends StandardRepository<User,Long> {
}
