/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Board {
    private String player_name;
    private int health;
    private int mana;
    private Deck deck = new Deck();
    private ArrayList<Card> graveyard = new ArrayList<>();
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Card> in_game = new ArrayList<>();
    
    public Board(){
        this.player_name = "no name";
        this.mana = 100;
        this.health = 100;
    }
      
    public ArrayList<Card> getGraveyard() {
        return graveyard;
    }

    public void setGraveyard(ArrayList<Card> graveyard) {
        this.graveyard = graveyard;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    
    public Board(String player_name){
        this.player_name = player_name;
        this.health = 100;
        this.mana = 100;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public void showHand() {
        for(Card card: this.hand){
            System.out.println("Carta: " + card.getName());
            System.out.println("Descrição: " + card.getDescription());
        }
    }
    
    public boolean addCard(Creature card){
        if(in_game.size() < 5){
            if(this.mana > card.getMana()){
                // Pode colocar carta
            in_game.add(card);
            return true;
            } else {
                System.out.println("Not enougth mana to invoke this creature!");
                return false;
            }
        } else {
            System.out.println("There is no space left for this creature in the battle!");
            return false;
        }
    }
    
    public boolean deck_to_hand(){
        // Pegar a primeira carta do deck e colocar na mão
        if(this.hand.size() < 5){
            Card card = this.deck.draw_card();
            this.hand.add(card);
            System.out.println(this.player_name + " saca " + card.getName());
            return true;
        } else {
            System.out.println("Mão cheia");
            return false;
        }        
    }
    
    public Card choose_card (int index) {
        if(index > 5){
            System.out.println("Error");
            return null;
        } else {
            return this.hand.get(index);
        }
    }
    
    public Creature choose_creature (int index) {
        return (Creature) this.choose_card(index);
    }
    
    public boolean hand_to_board(Card card) {
        
        if(this.in_game.size() < 5){
            System.out.println(this.player_name + " coloca " + card.getName() + " na batalha!");
            this.hand.remove(card);
            this.in_game.add(card);
            return true;
        } else {
            System.out.println("Não há espaço no campo de batalha");
            return false;
        }
    }
    
    public void board_to_graveyard (Card card) {
        System.out.println(this.player_name + ", " + card.getName() + " morreu e foi para o cemitério.");
        this.in_game.remove(card);
        this.graveyard.add(card);
    }
    
    public void show_board () {
        this.in_game.forEach((card) -> {
            System.out.println(this.player_name);
            card.showCard();
        });
    }
    
    public void show_graveyard () {
        System.out.println("Cemitério de: " + this.player_name);
        this.graveyard.forEach((card) -> {
            card.showCard();
        });
    }
    
    public void battle (Creature attacker_card, Board defender_board, Creature defender_card) {
        System.out.println(attacker_card.getName() + " ataca " + defender_card.getName());
        
        int damage_to_attacker = attacker_card.getHp() - defender_card.getAtk();
        int damage_to_defender = defender_card.getHp() - attacker_card.getAtk();
        
        // Se o dano sofrido pelo atacante for maior que o HP da carta, ela morre e o player sofre o dano.
        if(damage_to_attacker <= 0) {
            this.setHealth(this.getHealth() + damage_to_attacker);
            this.board_to_graveyard(attacker_card);
            System.out.println("Você sofreu " + damage_to_attacker + " de dano");
        } else {
            attacker_card.setHp(attacker_card.getHp() - damage_to_attacker);
            System.out.println(attacker_card.getName() + " sofreu " + damage_to_attacker + " de dano.");
            System.out.println(attacker_card.getName() + " HP: " + attacker_card.getHp() + "(-" + damage_to_attacker + ")");
        }
        
        // Se o dano sofrido pelo defensor for maior que o HP da carta, ela morre e o player sofre o dano.
        if(damage_to_defender <= 0) {
            defender_board.setHealth(defender_board.getHealth() - damage_to_defender);
            defender_board.board_to_graveyard(defender_card);
            System.out.println("Adversário sofreu " + damage_to_defender + " de dano");
        } else {
            defender_card.setHp(defender_card.getHp() - damage_to_defender);
            System.out.println(defender_card.getName() + " sofreu " + damage_to_defender + " de dano.");
            System.out.println(defender_card.getName() + " HP: " + defender_card.getHp() + "(-" + damage_to_defender + ")");
        }
    }   
}
