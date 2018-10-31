/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Cardgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        Board player_one = new Board("Vitor");
        
        Board player_two = new Board("Vinicius");
        
        player_one.deck_to_hand();
        player_one.deck_to_hand();
        player_one.deck_to_hand();
        player_one.deck_to_hand();
        player_one.deck_to_hand();

        // Colocar uma carta no tabuleiro
        //System.out.println("Escolha uma carta: ");
        //int choosen_card = s.nextInt();
        Creature card = player_one.choose_creature(2);
        //System.out.println("Carta escolhida: ");
        //card.showCard();
        player_one.hand_to_board(card);
        //System.out.println("Tabuleiro: ");
        //player_one.show_board();
        System.out.println("\n\n");

        player_two.deck_to_hand();
        player_two.deck_to_hand();
        player_two.deck_to_hand();
        player_two.deck_to_hand();
        player_two.deck_to_hand();
        
        //System.out.println("Escolha uma carta: ");
        //int choosen_card2 = s.nextInt();
        Creature card2 = player_two.choose_creature(1);
        //System.out.println("Carta escolhida: ");
        //card.showCard();
        player_two.hand_to_board(card2);
        //System.out.println("Tabuleiro: ");
        //player_two.show_board();
        
        System.out.println("\n\n\n");
        //card.showCard();
        //card2.showCard();
        // Simular um ataque
        System.out.println("Vez de " + player_one.getPlayer_name());
        player_one.battle(card, player_two, card2);
        System.out.println("\n\n\n");
        System.out.println("Vez de " + player_two.getPlayer_name());
        player_two.battle(card2, player_one, card);
        System.out.println("\n\n\n");
        player_one.show_graveyard();
        System.out.println("\n\n\n");
        player_two.show_graveyard();
    }
    
}
