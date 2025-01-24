/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.AbstractList;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thela
 */
public class Player {
    //lista de pokemons
    public List<Pokemon> PlayerPokemons = new ArrayList<>();
    //necesitamos tambien items
    public List<Item> PlayerItems = new ArrayList<>();
    
    public Player(){
        
    }
    
    public Player(List<Pokemon> PlayerPokemons,List<Item> PlayerItems){
        this.PlayerItems = PlayerItems;
        this.PlayerPokemons = PlayerPokemons;
    }
}
