package com.xoco.nuniez.gcp.config;

import com.xoco.nuniez.gcp.HelloGcpAppEngineApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloGcpAppEngineApplication.class);
    }
}
