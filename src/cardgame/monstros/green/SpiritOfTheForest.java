/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.green;

import cardgame.Creature;

/**
 *
 * @author vitor
 */
public class SpiritOfTheForest extends Creature{
    
    public SpiritOfTheForest(){
        this.setId(2);
        this.setName("Spirit Of The Forest");
        this.setType("Espírito Natural");
        this.setCost(1);
        this.setMana(3);
        this.setHp(1);
        this.setAtk(0);
        this.setDescription("Quando seu oponente declarar um ataque contra uma de suas criaturas, retorne as duas criaturas para a mão.");
    }
}
