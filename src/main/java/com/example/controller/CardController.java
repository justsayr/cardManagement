package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.BuissnessException;
import com.example.config.ErrorResponse;
import com.example.domain.Card;
import com.example.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {

	@Autowired
	private CardService service; 
	
	
	/*@GetMapping("/{id}")
	public ResponseEntity<?> getCardDetails(@PathVariable String id) throws BuissnessException{
		
		Card card = service.getCardDetails(id);
		
		if(card == null){
			throw new BuissnessException("User not found in the system");
		}
		
		return new ResponseEntity<Card>(card, HttpStatus.OK);
		
	}*/
	
	@GetMapping("/{id}")
	public Card getCardDetails(@PathVariable String id) throws BuissnessException{
		
		Card card = service.getCardDetails(id);
		
		if(card == null){
			throw new BuissnessException("User not found in the system");
		}
		
		return card;
		
	}
	
	@GetMapping()
	public List<Card> getCardDetailsByStatus(@RequestParam boolean status){
		
		return service.getCardDetailsByStatus(status);
	}
	
	@PostMapping
	public ResponseEntity<?> saveCardDeatils(@RequestBody Card card){
		service.saveCard(card);
		return new ResponseEntity<String>("saved successfully", HttpStatus.CREATED);
	}
	
	@ExceptionHandler(BuissnessException.class)
	private ResponseEntity<?> handleException(BuissnessException ex){
		ErrorResponse error = new ErrorResponse();
		error.setCode(100);
		error.setMessage(ex.getMessage());
		
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
		
	}
	
}
