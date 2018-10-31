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
public class AncientMage extends Creature{
    
    public AncientMage(){
        this.setId(25);
        this.setName("Ancient Mage");
        this.setType("Mago");
        this.setCost(2);
        this.setMana(3);
        this.setHp(2);
        this.setAtk(1);
        this.setDescription("Caso você ative uma carta mágica que cause dano, aumente esse dano em 1.");
    }
}