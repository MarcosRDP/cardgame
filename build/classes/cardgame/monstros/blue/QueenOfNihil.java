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
public class QueenOfNihil extends Creature{
    
    public QueenOfNihil(){
        this.setId(22);
        this.setName("Queen Of Nihil");
        this.setType("Cavaleiro Rúnico");
        this.setCost(2);
        this.setMana(2);
        this.setHp(2);
        this.setAtk(1);
        this.setDescription("Uma vez por turno, caso uma outra criatura azul que você controla sejam alvos de um ataque, você pode ativar uma magia diretamente do seu cemitério.");
    }
}