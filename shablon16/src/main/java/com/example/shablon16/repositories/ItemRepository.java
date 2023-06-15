package com.example.shablon16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shablon16.entities.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
