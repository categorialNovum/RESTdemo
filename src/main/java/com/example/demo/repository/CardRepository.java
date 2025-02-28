package com.example.demo.repository;

import com.example.demo.entity.MagicCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<MagicCard, UUID> {
    MagicCard save(MagicCard card);
//    MagicCard find(UUID cardId);
}
