package com.example.demo.controller;

import com.example.demo.constants.MtgConstants;
import com.example.demo.entity.MagicCard;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
public class DemoController {

    @Autowired
    CardRepository cardRepository;

    @GetMapping("/hello")
    String helloWorld() {
        return MtgConstants.HELLO_MSG;
    }

    @GetMapping("/lorem")
    String loremIpsum() {
        return MtgConstants.LOREM_MSG;
    }

    @PutMapping("/card/add")
    MagicCard addCard(){
        MagicCard card = new MagicCard(MtgConstants.CARD_NAME, MtgConstants.CARD_TEXT, MtgConstants.MANA_COST, MtgConstants.TYPES);
        System.out.println(card.toString());
        cardRepository.save(card);
        return card;
    }

    @GetMapping("/card/get")
    Optional<MagicCard> getCard(@RequestParam String id) {
        return cardRepository.findById(UUID.fromString(id));
    }
}
