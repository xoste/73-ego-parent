package com.xoste.leon.mapper;

import com.xoste.leon.pojo.Images;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 */
@Service
public interface ImagesMapper {
    /**
     * 新增图片
     * @param images Images
     * @return int
     */
    int insertImages(Images images);

    /**
     * 查询所有的图片
     * @return List<Images></Images>
     */
    List<Images> selectImages();

    /**
     * 删除图片
     * @param id int
     * @return int
     */
    int deleteImages(int id);
}
