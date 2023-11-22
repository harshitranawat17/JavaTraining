package com.multiple.Database.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multiple.Database.postgresql.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
