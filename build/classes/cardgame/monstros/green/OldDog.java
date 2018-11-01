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
public class OldDog extends Creature{
    public OldDog(){
        this.setId(9);
        this.setName("Old Dog");
        this.setType("Savage Creature");
        this.setCost(1);
        this.setMana(1);
        this.setHp(1);
        this.setAtk(2);
        this.setDescription("");
    }
}
