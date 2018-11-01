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
public class GameFun extends Magic{
    public GameFun() {
        this.setId(16);
        this.setName("Dark Ascension");
        this.setCost(1);
        this.setDescription("Ambos os jogadores compram uma carta e a revelam, o jogador que comprou a carta de menor HP pode adiciona-la a mão, caso contrário, ou caso seja uma magia, ela é enviada para o cemitério.");
    }
}
