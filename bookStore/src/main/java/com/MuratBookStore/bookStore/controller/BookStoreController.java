package com.MuratBookStore.bookStore.controller;

import com.MuratBookStore.bookStore.dto.BookOrderRequest;
import com.MuratBookStore.bookStore.model.Order;
import com.MuratBookStore.bookStore.service.BookService;
import com.MuratBookStore.bookStore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookstore")
@Component
public class BookStoreController {
    private final OrderService orderService;
    public BookStoreController(OrderService orderService) {
        this.orderService=orderService;
    }
    @GetMapping
    public ResponseEntity<String> HelloToMurat() {
        return ResponseEntity.ok("Hello Murat");
    }
    @PostMapping
    public ResponseEntity<String> putAndOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAndOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());
        return ResponseEntity.ok(order.toString());

    }
}
