package com.bit.exam01;

import java.util.Collections;
import java.util.ArrayList;

class Card {
	String suit;
	String number;
	
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	public String toString() {
		return suit+"ÀÇ "+number;
	}
}

class CardDeck{
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public CardDeck() {
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		for (int i=0; i<suit.length; i++)
			for(int j=0; j<number.length; j++)
				deck.add(new Card(suit[i],number[j]));
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		return deck.remove(0);
	}
}

class Player {
	ArrayList<Card> list = new ArrayList<Card>();
	
	public boolean isOnePair() {
		boolean re = false;
		for(int i=0;i<list.size();i++) {
			Card a = list.get(i);
			for(int j = i+1;j<list.size();j++){
				Card b = list.get(j);
				if(a.number.equals(b.number) ) {
					re = true;
					break;
				}
			}
			if(re == true) {
				break;
			}
		}
		
		return re;
	}
	
	public void getCard(Card card) {
		list.add(card);
	}
	public void showCards() {
		System.out.println(list);
	}
	
	
}


public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		
		for(int i=0;i<=5;i++){
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		
		p1.showCards();
		p2.showCards();
		
		if(p1.isOnePair()) {
			System.out.println("Player1:One Pair");
		} else {
			System.out.println("Player1:No One Pair");
		}
		
		if(p2.isOnePair()) {
			System.out.println("Player2:One Pair");
		} else {
			System.out.println("Player2:Not an One Pair");
		}		
			
	}
}
