package com.MuratBookStore.bookStore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "booksOrder")
@Data
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private List<Integer> bookList;
    @Column(nullable = false)
    private Double totalPrice;


}
