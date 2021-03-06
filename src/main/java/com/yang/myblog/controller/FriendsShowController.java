package com.yang.myblog.controller;

import com.yang.myblog.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：yangyin
 * @description：友链显示控制器
 * @date ：2021/3/19 20:13
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendlinks", friendLinkService.listFriendLink());
        return "friends";
    }
}
