/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.green;

import cardgame.Creature;

/**
 *
 * @author vitor
 */
public class EmeraldWing extends Creature{
    
    public EmeraldWing(){
        this.setId(1);
        this.setName("Emerald Wing");
        this.setType("Elemental Refinado");
        this.setCost(2);
        this.setMana(2);
        this.setHp(3);
        this.setAtk(1);
        this.setDescription("Retorne essa criatura ou uma carta na sua zona de mana para sua mão.");
    }
}