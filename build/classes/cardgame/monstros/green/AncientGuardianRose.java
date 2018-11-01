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
public class AncientGuardianRose extends Creature{
    public AncientGuardianRose(){
        this.setId(7);
        this.setName("Ancient Guardian Rose");
        this.setType("Baby Bird");
        this.setCost(1);
        this.setMana(2);
        this.setHp(1);
        this.setAtk(0);
        this.setDescription("Quando essa carta é invocada, você pode adicionar uma criatura “Bird” do seu deck para sua mão.");
    }
}
