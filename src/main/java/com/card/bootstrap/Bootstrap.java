package com.card.bootstrap;

import com.card.domain.Card;
import com.card.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {
    private final CardRepository cardRepository;
    @Override
    public void run(String... args) throws Exception {
        loadCards();
    }
    private void loadCards(){
        Card card1 = new Card();
        card1.setId(12L);
        card1.setCreditCardNumber(1231);
        card1.setDebitCardNumber(2333);
        card1.setCustomerId(321L);
        cardRepository.save(card1);

        Card card2 = new Card();
        card2.setCreditCardNumber(14);
        card2.setDebitCardNumber(22);
        card2.setCustomerId(321L);
        card2.setId(11L);
        cardRepository.save(card2);


        Card card3 = new Card();
        card3.setCreditCardNumber(134);
        card3.setDebitCardNumber(234);
        card3.setCustomerId(3333L);
        card3.setId(10L);
        cardRepository.save(card3);


        System.out.println("Account Loaded: " + cardRepository.count());
    }
}
