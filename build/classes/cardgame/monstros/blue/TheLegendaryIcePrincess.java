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
public class TheLegendaryIcePrincess extends Creature{
    
    public TheLegendaryIcePrincess(){
        this.setId(24);
        this.setName("The Legendary Ice Princess");
        this.setType("Cavaleiro Rúnico - Lenda");
        this.setCost(6);
        this.setMana(3);
        this.setHp(5);
        this.setAtk(2);
        this.setDescription("Você pode reduzir o custo dessa criatura em 1 ao"+
                " remover “contadores de Nihil” de qualquer lugar do campo, "+
                "quando ela for invocada. Quando ela é invoca, adicione uma "+
                "carta de magia do seu cemitério para sua mão. Enquanto essa "+
                "carta estiver em campo o custo para ativar magias azuis é "+
                "reduzido em 1 para ambos os jogadores");
    }
}