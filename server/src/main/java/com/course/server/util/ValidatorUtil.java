package com.course.server.util;

/**
 * @author Yilinlou
 * @date 11/21/20 8:13 下午
 * @Email:ylou7@stevens.edu
 */

import com.course.server.exception.ValidatorException;
import org.springframework.util.StringUtils;

public class ValidatorUtil {

    /**
     * 空校验（null or ""）
     */
    public static void require(String str, String fieldName) {
        if (StringUtils.isEmpty(str)) {
            throw new ValidatorException(fieldName+"不能为空");
        }
    }

    /**
     * 长度校验
     */
    public static void length(String str, String fieldName, int min, int max) {
        int length = 0;
        if (!StringUtils.isEmpty(str)) {
            length = str.length();
        }
        if (length < min || length > max) {
            throw new ValidatorException(fieldName+"长度"+min+"~"+max+"位");
        }
    }
}