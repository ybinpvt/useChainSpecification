package com.ybin.datajpa.entity;

import com.ybin.support.jpa.StandardEntity;
import lombok.Data;

import javax.persistence.*;

//使用jpa注解配置映射关系
@Data
@Entity     //告诉jpa这是一个实体类（和数据表映射的类）
public class User extends StandardEntity<User> {
    private String lastName;
    private String email;
}
