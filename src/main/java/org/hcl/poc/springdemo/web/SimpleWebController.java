package org.hcl.poc.springdemo.web;

import org.hcl.poc.springdemo.model.EnvResponse;
import org.hcl.poc.springdemo.model.PocResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class SimpleWebController {

    private AtomicInteger counter =  new AtomicInteger();

    @GetMapping("/")
    public @ResponseBody
    PocResponse greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) throws UnknownHostException {
        PocResponse resp = new PocResponse();
        resp.setId(counter.getAndIncrement());
        resp.setName(name);
        resp.setTime(new Date());
        resp.setHostname(InetAddress.getLocalHost().getHostName());
        return resp;
    }

    @GetMapping("/env")
    public @ResponseBody
    EnvResponse envTest() {
        EnvResponse resp = new EnvResponse();
        resp.setEnv(System.getenv());
        return resp;
    }

}
