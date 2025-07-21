package com.kurobytes.cards.repository;

import com.kurobytes.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

    Optional<Cards> findByMobileNumberAndActiveSw(String mobileNumber, boolean activeSw);

    Optional<Cards> findByCardNumberAndActiveSw(Long cardNumber, boolean activeSw);

}
