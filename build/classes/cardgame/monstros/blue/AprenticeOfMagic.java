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
public class AprenticeOfMagic extends Creature{
    
    public AprenticeOfMagic(){
        this.setId(25);
        this.setName("Aprentice Of Magic");
        this.setType("Mago");
        this.setCost(1);
        this.setMana(2);
        this.setHp(1);
        this.setAtk(0);
        this.setDescription("Reduza o custo de uma magia que custe 4 ou mais em 1.");
    }
}