package com.xoste.leon.mapper;

import com.xoste.leon.pojo.Images;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 */
@Service
public interface ImagesMapper {
    /**
     * 查询所有图片
     * @return List<Images></Images>
     */
    @Select("select * from images")
    List<Images> selectImages();
}
