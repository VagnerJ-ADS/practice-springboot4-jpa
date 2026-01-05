package com.bonus.course.repositories;

import com.bonus.course.entities.Order;
import com.bonus.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
