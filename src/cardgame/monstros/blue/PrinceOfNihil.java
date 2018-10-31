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
public class PrinceOfNihil extends Creature{
    
    public PrinceOfNihil(){
        this.setId(23);
        this.setName("Prince Of Nihil");
        this.setType("Cavaleiro Rúnico");
        this.setCost(3);
        this.setMana(1);
        this.setHp(3);
        this.setAtk(1);
        this.setDescription("Quando essa criatura é invocada, compre uma carta, se for uma criatura “Nihil” ou uma “The Legendary Ice Princess” adicione-a sua mão, caso contrário devolva para o deck e embaralhe-o.");
    }
}