package com.example.demo.controller;

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
    private final String HELLO_MSG = "{\"message\" : \"hello, world\"}";
    private final String LOREM_MSG = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
            "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " +
            "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
            "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
            "culpa qui officia deserunt mollit anim id est laborum.";

    private final String CARD_NAME = "Rampant Growth";
    private final String CARD_TEXT = "Search your library for a basic land card, put that card onto the battlefield tapped, then shuffle.";
    private final String MANA_COST = "1C,1G";

    @Autowired
    CardRepository cardRepository;

    @GetMapping("/hello")
    String helloWorld() {
        return HELLO_MSG;
    }

    @GetMapping("/lorem")
    String loremIpsum() {
        return LOREM_MSG;
    }

    @PutMapping("/card/add")
    MagicCard addCard(){
        MagicCard card = new MagicCard(CARD_NAME, CARD_TEXT, MANA_COST);
        System.out.println(card.toString());
        cardRepository.save(card);
        return card;
    }

    @GetMapping("/card/get")
    Optional<MagicCard> getCard(@RequestParam String id) {
        return cardRepository.findById(UUID.fromString(id));
    }
}
