package com.fusion.app.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET

@Controller
class HomeController {

    @RequestMapping("/", method = [GET])
    fun index(model:Model) =
        model.addAttribute("data","hello spring")
        .let { "index" }
}