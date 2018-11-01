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
public class RunicKingdomOfNihil extends Magic{
    public RunicKingdomOfNihil () {
        this.setId(31);
        this.setName("Runic Kingdom Of Nihil");
        this.setCost(2);
        this.setDescription("Após a ativação desta carta, ela permanece em campo. Sempre que uma carta de magia azul for ativada coloque um “contador de Nihil” nessa carta. Você pode reduzir o custos azuis em 1 ao remover dois contadores dessa carta.");
    }
}
