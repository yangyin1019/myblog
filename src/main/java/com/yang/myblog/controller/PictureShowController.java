package com.yang.myblog.controller;

import com.yang.myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：yangyin
 * @description：照片墙页面显示控制器
 * @date ：2021/3/16 12:59
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) {
        model.addAttribute("pictures", pictureService.listPicture());
        return "picture";
    }
}
