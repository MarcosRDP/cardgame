/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.blue;

import cardgame.Creature;

/**
 *
 * @author vitor
 */
public class KingOfNihil extends Creature{
    
    public KingOfNihil(){
        this.setId(21);
        this.setName("King Of Nihil");
        this.setType("Cavaleiro Rúnico");
        this.setCost(2);
        this.setAtk(2);
        this.setHp(2);
        this.setMana(2);
        this.setDescription("Caso seu oponente declare um ataque contra outra criatura que você controla, você pode mudar o alvo para essa carta.");
    }
}