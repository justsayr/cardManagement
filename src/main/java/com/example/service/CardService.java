package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Card;
import com.example.repository.ICardRepo;

@Service
public class CardService {

	@Autowired
	private ICardRepo repo;
	
	public Card getCardDetails(String id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	public void saveCard(Card card) {
		repo.save(card);
	}


	public List<Card> getCardDetailsByStatus(boolean status) {
		return repo.findCardByCardStatus(status);
	}
	
}
