package com.minjiao.controller;

import com.minjiao.domain.CheckInfo;
import com.minjiao.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2021/12/23 20:25
 * @description:
 */
@RestController
@RequestMapping("/check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    @RequestMapping("/checkBook")
    public Integer check(@RequestBody CheckInfo checkInfo) {
        return checkService.check(checkInfo.getUsername(), checkInfo.getBookNo(), checkInfo.getCode());
    }
}
