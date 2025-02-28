package com.example.demo.service;

import com.example.demo.entity.MagicCard;
import com.example.demo.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CardService {
    private final CardRepository cardRepo;

    public CardService(CardRepository repo){
        this.cardRepo = repo;
    }

    public Optional<MagicCard> getCard(UUID id){
        return  cardRepo.findById(id);
    }

    public MagicCard saveCard(MagicCard card){
        return cardRepo.save(card);
    }
}
