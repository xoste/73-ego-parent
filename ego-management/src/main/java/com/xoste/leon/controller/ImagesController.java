package com.xoste.leon.controller;

import com.xoste.leon.pojo.Images;
import com.xoste.leon.service.ImagesService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author Leon
 */
@Controller
public class ImagesController {
    @Resource
    private ImagesService imagesServiceImpl;
    @RequestMapping("/insert")
    public String insertImages(MultipartFile file, HttpServletRequest req) {
        try {
            String originalFilename = file.getOriginalFilename();
            String realPath = req.getServletContext().getRealPath("files");
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath, originalFilename));
            Images images = new Images();
            images.setPath(originalFilename);
            int index = imagesServiceImpl.insertImages(images);
            if (index > 0) {
                req.setAttribute("success", "上传成功！");
                return "/show";
            } else {
                req.setAttribute("error", "上传失败!");
                return "/images.jsp";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/show")
    public String selectImages(Model model) {
        model.addAttribute("imagesList", imagesServiceImpl.selectImages());
        return "/images_show.jsp";
    }

    @RequestMapping("/delete")
    public String deleteImages(int id, Model model) {
        int index = imagesServiceImpl.deleteImages(id);
        if (index > 0) {
            model.addAttribute("success", "删除成功！");
            return "show";
        } else {
            model.addAttribute("error", "删除失败！");
            return "images_show.jsp";
        }
    }
}
