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
public class IPKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(
                Objects.requireNonNull(exchange
                        .getRequest()
                        .getRemoteAddress())
                        .getAddress()
                        .getHostAddress());
    }
}
