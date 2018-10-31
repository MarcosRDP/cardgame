/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.monstros.blue;

import cardgame.Magic;

/**
 *
 * @author vitor
 */
public class RunicSpell extends Magic{
    public RunicSpell () {
        this.setId(32);
        this.setName("Runic Spell");
        this.setCost(1);
        this.setDescription("Aumente o ataque de uma criatura que você controla em +2 até o final do turno.");
    }
}
