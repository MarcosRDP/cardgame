/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Creature extends Card{
    private int atk;
    private int hp;
    private int mana;
    
    public Creature(){}
    
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    @Override
    public void showCard(){
        super.showCard();
        System.out.println("ATK: " + this.getAtk() + " | HP: " + this.getHp());
    }
}
