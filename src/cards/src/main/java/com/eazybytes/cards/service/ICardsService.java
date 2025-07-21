package com.kurobytes.cards.service;

import com.kurobytes.cards.command.event.CardUpdatedEvent;
import com.kurobytes.cards.dto.CardsDto;
import com.kurobytes.cards.entity.Cards;

public interface ICardsService {

    /**
     *
     * @param card - Cards Object
     */
    void createCard(Cards card);
    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Card Details based on a given mobileNumber
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @param event - CardUpdatedEvent Object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateCard(CardUpdatedEvent event);

    /**
     *
     * @param cardNumber - Input Card Number
     * @return boolean indicating if the delete of card details is successful or not
     */
    boolean deleteCard(Long cardNumber);

}
