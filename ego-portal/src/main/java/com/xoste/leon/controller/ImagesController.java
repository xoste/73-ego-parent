package com.xoste.leon.controller;

import com.xoste.leon.service.ImagesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Leon
 */
@Controller
public class ImagesController {
    @Resource
    private ImagesService imagesServiceImpl;
    @RequestMapping("/")
    public String selectImages(Model model) {
        model.addAttribute("imagesList", imagesServiceImpl.selectImages());
        return "/index.jsp";
    }
}
