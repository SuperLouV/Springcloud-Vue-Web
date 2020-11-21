package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yilinlou
 * @date 7/17/20 7:15 下午
 * @Email:ylou7@stevens.edu
 */
@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list(){
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id asc");
        return chapterMapper.selectByExample(chapterExample);
    }
}
