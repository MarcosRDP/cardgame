/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import cardgame.monstros.*;
import cardgame.monstros.blue.*;
import java.util.ArrayList;
/**
 *
 * @author vitor
 */
public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    private String deck_name;
    
    public Deck() {
        this.cards.add(new SaphireSpirit());
        this.cards.add(new KingOfNihil());
        this.cards.add(new PrinceOfNihil());
        this.cards.add(new QueenOfNihil());
        this.cards.add(new AprenticeOfMagic());
        this.cards.add(new AncientMage());        
    }
    
    public Deck(String name) {
        this.deck_name = name;
        this.cards.add(new SaphireSpirit());
        this.cards.add(new KingOfNihil());
        this.cards.add(new PrinceOfNihil());
        this.cards.add(new QueenOfNihil());
        this.cards.add(new AprenticeOfMagic());
        this.cards.add(new AncientMage());   
    }
    
    public int deck_size(){
        return this.cards.size();
    }
    
    public Card draw_card () {
        Card card = this.cards.get(0);
        this.cards.remove(card);
        //card.showCard();
        return card;
    }
}
