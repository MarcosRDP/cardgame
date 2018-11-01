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
public class AgedBird extends Creature{
    public AgedBird(){
        this.setId(3);
        this.setName("Aged Bird");
        this.setType("Bird Creature");
        this.setCost(2);
        this.setMana(2);
        this.setHp(1);
        this.setAtk(0);
        this.setDescription("1 incolor - Essa carta pode atacar seu oponente diretamente, se ele controlar apenas uma criatura.");
    }
}
