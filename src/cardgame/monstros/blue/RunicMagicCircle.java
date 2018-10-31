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
public class RunicMagicCircle extends Magic{
    public RunicMagicCircle () {
        this.setId(33);
        this.setName("Runic Magic Circle");
        this.setCost(2);
        this.setDescription("Essa carta se mantém no campo depois de utilizada. Todas as magias azuis que você conjura custam 1 a menos. Você pode enviar essa carta do campo para o cemitério, reduza todo ataque que você receba neste turno em -2, pode ser ativado em ambos os turnos.");
    }
}