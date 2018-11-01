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
public class PlannedAttack extends Magic{
    public PlannedAttack() {
        this.setId(13);
        this.setName("Planned Attack");
        this.setCost(1);
        this.setDescription("De alvo em uma criatura invocada nesse turno, essa criatura pode atacar diretamente nesse turno.");
    }
}
