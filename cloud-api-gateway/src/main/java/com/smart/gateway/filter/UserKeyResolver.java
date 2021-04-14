package com.smart.gateway.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * 获取客服端的请求ip地址
 */
@Component
public class UserKeyResolver implements KeyResolver {
    private static final String REQUEST_QUERY_PARAMS_ID = "userId";
        
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(
                Objects.requireNonNull(exchange
                        .getRequest()
                        .getQueryParams()
                        .getFirst(REQUEST_QUERY_PARAMS_ID)));
    }
}
