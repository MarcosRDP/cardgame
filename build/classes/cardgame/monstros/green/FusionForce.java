/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.green;

import cardgame.Magic;

/**
 *
 * @author marco
 */
public class FusionForce extends Magic{
    public FusionForce() {
        this.setId(18);
        this.setName("Fusion Force");
        this.setCost(2);
        this.setDescription("Retorne uma criatura que você controla para sua mão, de alvo em outra criatura que você controla, ela ganha ATK igual ao ATK da criatura retornada.");
    }
}
