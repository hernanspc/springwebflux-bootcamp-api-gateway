package com.springwebflux.bootcamp.bank.gateway.app;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/api/personal/**").uri("lb://SERVICE-PERSONAL/").id("service-personal"))
				.route(r -> r.path("/api/business/**").uri("lb://SERVICE-BUSINESS/").id("service-business"))
				
				.route(r -> r.path("/api/count-saving/**").uri("lb://SERVICE-COUNT-SAVING/").id("service-count-saving"))
				.route(r -> r.path("/api/count-current/**").uri("lb://SERVICE-COUNT-CURRENT/").id("service-count-current"))
				
				.route(r -> r.path("/api/count-advancement/**").uri("lb://SERVICE-COUNT-ADVANCEMENT/").id("service-count-advancement"))

				.route(r -> r.path("/api/count-credit/**").uri("lb://SERVICE-COUNT-CREDIT/").id("service-count-credit"))
				.route(r -> r.path("/api/count-fixed-term/**").uri("lb://SERVICE-FIXED-TERM/").id("service-count-fixed-term"))
				.route(r -> r.path("/api/count-staff/**").uri("lb://SERVICE-COUNT-STAFF/").id("service-count-staff"))
				.build();
	}
}
