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
public class WhiteKnightSummon extends Magic{
    public WhiteKnightSummon () {
        this.setId(34);
        this.setName("White Knight Summon");
        this.setCost(2);
        this.setDescription("Conjure até três fichas de criatura azul (Atk:1/HP:2) do tipo “Knight” e de nome “White Knight” nas suas zonas de criatura.");
    }
}