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
public class SaintBird extends Creature{
    public SaintBird(){
        this.setId(5);
        this.setName("Saint Bird");
        this.setType("Bird Creature");
        this.setCost(2);
        this.setMana(2);
        this.setHp(2);
        this.setAtk(2);
        this.setDescription("1 verde  – Retorne essa carta do campo para a mão, se fizer isso adicione uma criatura “Bird” do seu deck para sua mão.");
    }
}
