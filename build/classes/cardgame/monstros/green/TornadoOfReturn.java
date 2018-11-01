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
public class TornadoOfReturn extends Magic{
    public TornadoOfReturn() {
        this.setId(15);
        this.setName("Tornado of Return");
        this.setCost(2);
        this.setDescription("Retorne uma criatura que seu oponente controla do campo para a mão");
    }
}
