package com.card.services;

import com.card.api.v1.dto.CardDto;
import com.card.api.v1.mappers.CardMapper;
import com.card.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardMapper cardMapper;
    private final CardRepository cardRepository;
    public List<CardDto> getCardsOfAllCustomers() {
        return cardRepository.findAll()
                .stream()
                .map(cardMapper::cardToCardDto)
                .collect(Collectors.toList());
    }

    public List<CardDto> getCardsOfGivenCustomer(Long customerId) {
        return cardRepository.findAll()
                .stream()
                .filter(card -> card.getCustomerId().equals(customerId))
                .map(cardMapper::cardToCardDto)
                .collect(Collectors.toList());
    }
}
