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
public class KnightOfTheRose extends Creature{
    public KnightOfTheRose(){
        this.setId(11);
        this.setName("Ancient Guardian Rose");
        this.setType("Noble Knight");
        this.setCost(3);
        this.setMana(1);
        this.setHp(3);
        this.setAtk(2);
        this.setDescription("1 verde - Descarte uma carta, adicione umacriatura “Bird” do seu deck para sua mão.");
    }
}
