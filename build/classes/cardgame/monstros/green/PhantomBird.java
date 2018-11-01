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
public class PhantomBird extends Creature{
    public PhantomBird(){
        this.setId(4);
        this.setName("Phantom Bird");
        this.setType("Bird Creature");
        this.setCost(2);
        this.setMana(4);
        this.setHp(2);
        this.setAtk(1);
        this.setDescription("Durante o início da fase de combate inimiga, essa carta não pode ser alvo de ataques inimigos nesse turno, caso não existam outras criaturas no seu campo, seu oponente pode atacar diretamente. ");
    }
}
