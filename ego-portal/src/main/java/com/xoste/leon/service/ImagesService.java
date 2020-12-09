package com.xoste.leon.service;

import com.xoste.leon.pojo.Images;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 */
@Service
public interface ImagesService {
    /**
     * 查询所有图片
     * @return List<Images></Images>
     */
    List<Images> selectImages();
}
