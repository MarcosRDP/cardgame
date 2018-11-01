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
public class ForceEagle extends Creature{
    public ForceEagle(){
        this.setId(10);
        this.setName("Force Eagle");
        this.setType("Bird");
        this.setCost(2);
        this.setMana(2);
        this.setHp(1);
        this.setAtk(3);
        this.setDescription("Se essa carta for destruída durante a sua vez, compre uma carta e revele-a, se for uma criatura verde adicione-a sua mão.");
    }
}
