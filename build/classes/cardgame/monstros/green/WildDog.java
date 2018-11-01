/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.green;

import cardgame.Creature;

/**
 *
 * @author marco
 */
public class WildDog extends Creature{
    public WildDog(){
        this.setId(8);
        this.setName("Wild Dog");
        this.setType("Savage Creature");
        this.setCost(0);
        this.setMana(2);
        this.setHp(1);
        this.setAtk(2);
        this.setDescription("No final do turno, reduza o HP dessa criatura em 1.");
    }
}
