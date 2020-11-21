package com.course.business.controller.admin;

import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yilinlou
 * @date 7/6/20 9:14 下午
 * @Email:ylou7@stevens.edu
 */
//@RequestMapping("/system")
@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterServicel;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter(){
        return chapterServicel.list();
    }
}
