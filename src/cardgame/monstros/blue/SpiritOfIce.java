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
public class SpiritOfIce extends Creature{
    
    public SpiritOfIce(){
        this.setId(19);
        this.setName("Spirit Of Ice");
        this.setType("Espírito Místico");
        this.setCost(1);
        this.setAtk(0);
        this.setHp(2);
        this.setMana(3);
        this.setDescription("Quando seu oponente declarar um ataque contra uma de suas criaturas, você pode descartar essa carta da sua mão, se fizer isso imediatamente ative uma magia diretamente da sua mão.");
    }
}