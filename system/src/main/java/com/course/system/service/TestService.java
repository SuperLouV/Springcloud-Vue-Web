package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yilinlou
 * @date 7/17/20 7:15 下午
 * @Email:ylou7@stevens.edu
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
