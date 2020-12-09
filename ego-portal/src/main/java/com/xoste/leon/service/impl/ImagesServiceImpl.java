package com.xoste.leon.service.impl;

import com.xoste.leon.mapper.ImagesMapper;
import com.xoste.leon.pojo.Images;
import com.xoste.leon.service.ImagesService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Leon
 */
@Service
public class ImagesServiceImpl implements ImagesService {
    @Value("${management.images.url}")
    private String path;
    @Resource
    private ImagesMapper imagesMapper;
    /**
     * 查询所有图片
     *
     * @return List<Images></Images>
     */
    @Override
    public List<Images> selectImages() {
        List<Images> images = imagesMapper.selectImages();
        for (Images image: images) {
            image.setPath(path + image.getPath());
        }
        return images;
    }
}
