/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import cardgame.monstros.*;
import cardgame.monstros.green.*;
import java.util.ArrayList;
/**
 *
 * @author vitor
 */
public class DeckVerde {
    private ArrayList<Card> cards = new ArrayList<>();
    private String deck_name;
    
    public DeckVerde() {
        this.cards.add(new AgedBird());
        this.cards.add(new AgedBird());
        this.cards.add(new AncientGuardianOfTheWest());
        this.cards.add(new AncientGuardianRose());
        this.cards.add(new AncientGuardianRose());
        this.cards.add(new DarkAscension());
        this.cards.add(new EmeraldWing());
        this.cards.add(new EmeraldWing());
        this.cards.add(new ForceEagle());      
        this.cards.add(new ForceEagle());  
        this.cards.add(new FusionForce());     
        this.cards.add(new GameFun());     
        this.cards.add(new GameFun());   
        this.cards.add(new KnightOfTheRose());     
        this.cards.add(new KnightOfTheRose()); 
        this.cards.add(new OldDog());     
        this.cards.add(new OldDog());   
        this.cards.add(new PhantomBird());     
        this.cards.add(new PhantomBird()); 
        this.cards.add(new PlannedAttack());    
        this.cards.add(new PlannedAttack()); 
        this.cards.add(new SaintBird());  
        this.cards.add(new SaintBird()); 
        this.cards.add(new SavageWind());
        this.cards.add(new SpiritOfTheForest());
        this.cards.add(new StormOfTheGuardians());
        this.cards.add(new TornadoOfReturn());
        this.cards.add(new TornadoOfReturn());
        this.cards.add(new WildDog());
        this.cards.add(new WildDog());
    }
    
    public DeckVerde(String name) {
        this.deck_name = name;
        this.cards.add(new AgedBird());
        this.cards.add(new AgedBird());
        this.cards.add(new AncientGuardianOfTheWest());
        this.cards.add(new AncientGuardianRose());
        this.cards.add(new AncientGuardianRose());
        this.cards.add(new DarkAscension());
        this.cards.add(new EmeraldWing());
        this.cards.add(new EmeraldWing());
        this.cards.add(new ForceEagle());      
        this.cards.add(new ForceEagle());  
        this.cards.add(new FusionForce());     
        this.cards.add(new GameFun());     
        this.cards.add(new GameFun());   
        this.cards.add(new KnightOfTheRose());     
        this.cards.add(new KnightOfTheRose()); 
        this.cards.add(new OldDog());     
        this.cards.add(new OldDog());   
        this.cards.add(new PhantomBird());     
        this.cards.add(new PhantomBird()); 
        this.cards.add(new PlannedAttack());    
        this.cards.add(new PlannedAttack()); 
        this.cards.add(new SaintBird());  
        this.cards.add(new SaintBird()); 
        this.cards.add(new SavageWind());
        this.cards.add(new SpiritOfTheForest());
        this.cards.add(new StormOfTheGuardians());
        this.cards.add(new TornadoOfReturn());
        this.cards.add(new TornadoOfReturn());
        this.cards.add(new WildDog());
        this.cards.add(new WildDog());
    }
    
    public int deck_size(){
        return this.cards.size();
    }
    
    public Card draw_card () {
        Card card = this.cards.get(0);
        this.cards.remove(card);
        //card.showCard();
        return card;
    }
}
