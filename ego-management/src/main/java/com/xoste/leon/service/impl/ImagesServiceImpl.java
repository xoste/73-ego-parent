package com.xoste.leon.service.impl;

import com.xoste.leon.mapper.ImagesMapper;
import com.xoste.leon.pojo.Images;
import com.xoste.leon.service.ImagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Leon
 */
@Service
public class ImagesServiceImpl implements ImagesService {
    @Resource
    private ImagesMapper imagesMapper;
    /**
     * 新增图片
     *
     * @return int
     */
    @Override
    public int insertImages(Images images) {
        return imagesMapper.insertImages(images);
    }

    @Override
    public List<Images> selectImages() {
        return imagesMapper.selectImages();
    }

    @Override
    public int deleteImages(int id) {
        return imagesMapper.deleteImages(id);
    }
}
