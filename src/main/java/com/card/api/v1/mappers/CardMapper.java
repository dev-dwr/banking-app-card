package com.card.api.v1.mappers;

import com.card.api.v1.dto.CardDto;
import com.card.domain.Card;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CardMapper {
    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
    CardDto cardToCardDto(Card card);
}

