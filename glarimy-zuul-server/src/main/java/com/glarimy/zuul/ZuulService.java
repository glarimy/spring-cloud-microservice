package com.glarimy.zuul;

import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulService {
    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(ZuulService.class, args);
    }
}
