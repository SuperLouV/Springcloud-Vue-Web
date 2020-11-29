package com.course.server.mapper.my;

import org.apache.ibatis.annotations.Param;

/**
 * @author Yilinlou
 * @date 11/29/20 3:32 下午
 * @Email:ylou7@stevens.edu
 */
public interface MyCourseMapper {
    int updateTime(@Param("courseId") String courseId);
}
