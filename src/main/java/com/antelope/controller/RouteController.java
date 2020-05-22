package com.antelope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

/**
 * @author yangmeiliang
 */
@Controller
public class RouteController {

    @RequestMapping(value = {
            "/index",
            "/home",
            "/"
    })
    public Mono<String> index(Model model) {
        return Mono.create(monoSink -> monoSink.success("index"));
    }
}
