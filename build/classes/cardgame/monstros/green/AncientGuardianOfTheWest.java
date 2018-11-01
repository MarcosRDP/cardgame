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
public class AncientGuardianOfTheWest extends Creature{
     public AncientGuardianOfTheWest(){
        this.setId(6);
        this.setName("Ancient Guardian of the West");
        this.setType("Ancient Bird");
        this.setCost(3);
        this.setMana(1);
        this.setHp(3);
        this.setAtk(4);
        this.setDescription("Se essa carta não foi invocada pelo efeito de “Saint Bird”, ela perde 1 de HP e de ATK. Quando essa carta for destruída se houver lugares vagos na zona de mana, você pode posicionar essa carta.");
    }
}
