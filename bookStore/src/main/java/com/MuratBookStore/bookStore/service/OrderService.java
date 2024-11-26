package com.MuratBookStore.bookStore.service;

import com.MuratBookStore.bookStore.model.Book;
import com.MuratBookStore.bookStore.model.Order;
import com.MuratBookStore.bookStore.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class OrderService {
    private  final BookService bookService;
    private final Logger logger=  LoggerFactory.getLogger(OrderService.class);
    private final OrderRepository orderRepository;
    public OrderService(BookService bookService, OrderRepository orderRepository) {
        this.bookService = bookService;
        this.orderRepository = orderRepository;
    }
            public Order putAndOrder(List<Integer> bookIDList,String userName){
                List<Optional<Book>> bookList = bookIDList.stream().map(bookId->bookService.findBookByİd(bookId)).collect(Collectors.toList());

                Double totalPrice = bookList.stream()
                        .map(optionalBook->optionalBook.map(book->book.getPrice()).orElse(Double.valueOf("0")))
                        .reduce(0.0,Double::sum);
                Order order = Order.builder()
                        .bookList(bookIDList)
                        .totalPrice(totalPrice)
                        .userName(userName)
                        .build();

                return orderRepository.save(order);


    }

}
