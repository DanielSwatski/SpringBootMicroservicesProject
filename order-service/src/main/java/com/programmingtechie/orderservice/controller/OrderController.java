package com.programmingtechie.orderservice.controller;

import com.programmingtechie.orderservice.dto.OrderRequest;
import com.programmingtechie.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @Retry(name="inventory")
    @TimeLimiter(name = "inventory")
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallBackMethod") // needs a fallback method
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompletableFuture<String>  placeOrder(@RequestBody OrderRequest orderRequest) {
        return (CompletableFuture.supplyAsync(() -> orderService.placeOrder(orderRequest)));

    }

    public CompletableFuture<String> fallBackMethod(@RequestBody OrderRequest ord, RuntimeException e){
        return (CompletableFuture.supplyAsync(() -> "Fall Back Method is called: " + e.getLocalizedMessage()));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getAllOrders() {
        return orderService.getAllOrders();
    }
}
