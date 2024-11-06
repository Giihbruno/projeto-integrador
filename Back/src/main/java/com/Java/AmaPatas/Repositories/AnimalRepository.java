package com.Java.AmaPatas.Repositories;

import com.Java.AmaPatas.Models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
