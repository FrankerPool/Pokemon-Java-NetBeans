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
    //
    public String NamePlayer;
    //lista de pokemons
    public List<Pokemon> PlayerPokemons = new ArrayList<>();
    //
    public List<Pokemon> SelectedPokemons = new ArrayList<>();
    //necesitamos tambien items
    public List<Item> PlayerItems = new ArrayList<>();
    
    public Player(){
        
    }
    
    public Player(String namePlayer ,List<Pokemon> SelectedPokemons,List<Pokemon> PlayerPokemons,List<Item> PlayerItems){
        this.NamePlayer = namePlayer;
        this.PlayerItems = PlayerItems;
        this.PlayerPokemons = PlayerPokemons;
        this.SelectedPokemons = SelectedPokemons;
    }

    public String getNamePlayer() {
        return NamePlayer;
    }

    public List<Pokemon> getPlayerPokemons() {
        return PlayerPokemons;
    }

    public List<Pokemon> getSelectedPokemons() {
        return SelectedPokemons;
    }

    public List<Item> getPlayerItems() {
        return PlayerItems;
    }

    public void setNamePlayer(String NamePlayer) {
        this.NamePlayer = NamePlayer;
    }

    public void setPlayerPokemons(List<Pokemon> PlayerPokemons) {
        this.PlayerPokemons = PlayerPokemons;
    }

    public void setSelectedPokemons(List<Pokemon> SelectedPokemons) {
        this.SelectedPokemons = SelectedPokemons;
    }

    public void setPlayerItems(List<Item> PlayerItems) {
        this.PlayerItems = PlayerItems;
    }
}
