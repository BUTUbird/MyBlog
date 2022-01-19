package org.butu.blog.controller;


import org.butu.blog.Result;
import org.butu.blog.ResultInfo;
import org.butu.blog.api.UserService;
import org.butu.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BUTUbird
 * @since 2022-01-18
 */
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public Result list(){
        List<User> list = userService.list();
        return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data",list);

    }

}
