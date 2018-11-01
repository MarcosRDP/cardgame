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
public class SaphireSpirit extends Creature{
    
    public SaphireSpirit(){
        this.setId(19);
        this.setName("Saphire Spirit");
        this.setType("Elemental Refinado");
        this.setCost(2);
        this.setAtk(2);
        this.setHp(2);
        this.setMana(2);
        this.setDescription("Destrua uma carta de mana ou preparada em ambos os lados do campo, você só pode usar esse efeito uma vez por turno.");
    }
}
