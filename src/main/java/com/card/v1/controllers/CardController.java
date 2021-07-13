package com.card.v1.controllers;

import com.card.api.v1.dto.CardDto;
import com.card.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping
    public List<CardDto> getAllCards(){
        return cardService.getCardsOfAllCustomers();
    }

    @GetMapping("/{customerId}")
    public List<CardDto> getCardsOfGivenCustomer(@PathVariable("customerId") Long customerId){
        return cardService.getCardsOfGivenCustomer(customerId);
    }

}
