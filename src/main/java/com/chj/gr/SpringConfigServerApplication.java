package com.chj.gr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}
	
	/**
	     http://localhost:8762/z-springboot-bar-service/default
	     http://localhost:8762/z-springboot-bar-service/local
	     http://localhost:8762/z-springboot-bar-service/dev
	     http://localhost:8762/z-springboot-bar-service/homol
    	 http://localhost:8762/z-springboot-bar-service/prod
	 */
	/**
    	 http://localhost:8443/z-springboot-bar-service/default
	     http://localhost:8443/z-springboot-bar-service/local
	     http://localhost:8443/z-springboot-bar-service/dev
	     http://localhost:8443/z-springboot-bar-service/homol
    	 http://localhost:8443/z-springboot-bar-service/prod
	 */
	
	
}
