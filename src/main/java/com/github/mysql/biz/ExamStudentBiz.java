package com.github.mysql.biz;


import com.github.mysql.bean.ExamStudent;

import java.util.List;

/**
 * ExamStudent业务逻辑层
 */
public interface ExamStudentBiz extends CommonBiz<ExamStudent>{
    /**
     * 全查
     * @return
     */
    List<ExamStudent> queryAll();
}
