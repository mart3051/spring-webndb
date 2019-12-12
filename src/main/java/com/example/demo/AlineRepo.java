package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlineRepo extends JpaRepository<Alien,Integer>{
 Iterable<Alien> findByName(String name);
 @Query("from Alien order by name")
 Iterable<Alien> fetchBySortedNames();
}
