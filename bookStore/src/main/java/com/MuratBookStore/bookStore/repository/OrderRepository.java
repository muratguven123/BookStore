package com.MuratBookStore.bookStore.repository;

import com.MuratBookStore.bookStore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(basePackageClasses = OrderRepository.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
