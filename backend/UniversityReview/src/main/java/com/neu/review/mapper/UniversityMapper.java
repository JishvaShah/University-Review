package com.neu.review.mapper;

import com.neu.review.pojo.University;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UniversityMapper {
    /**
     * @param id
     * @return
     */
    University getByID(Integer id);
}