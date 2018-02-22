package com.yanni.bootapp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yannipeng on 2/21/18.
 */
@RestController
public class ModelController {

    @RequestMapping(value = "/model")
    public @ResponseBody String getModel( ) {
        return "Success";
    }
}
