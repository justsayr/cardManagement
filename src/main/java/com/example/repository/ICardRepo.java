package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domain.Card;

@RepositoryRestResource
public interface ICardRepo extends JpaRepository<Card, String> {
	
	//List<Card> findCardByCardNumberAndCardBlock(String cardNumber,boolean cardStatus);
	
//	@Query("select c from Card c where c.cardBlock =:cardStatus ")
	//@Query(nativeQuery=true, value="select * from card where cardBlock =?0")
	List<Card> findCardByCardStatus(boolean cardStatus);

}
