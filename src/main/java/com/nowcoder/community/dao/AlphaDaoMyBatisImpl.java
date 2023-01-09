package com.nowcoder.community.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//优先级高
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
