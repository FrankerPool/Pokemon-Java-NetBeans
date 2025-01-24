/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokemon.java;

import Model.Attack;
import Model.Item;
import Model.Player;
import Model.Pokemon;
import Views.Game;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thela
 */
public class PokemonJava {
    
    //lista con todos los pokemons - agregados manualmente
    public List<Pokemon> DataBasePokemons = new ArrayList<>();
    //necesitamos tambien items
    public List<Item> DataBaseItems = new ArrayList<>();
    //lista de los ataques disponibles para todos los pokemons electricos
    public List<Attack> PokemonAttacksElectric = new ArrayList<>();
    public List<Attack> PokemonsAttackFire = new ArrayList<>();
    public List<Attack> PokemonsAttackWater = new ArrayList<>();
    //
    public Player playerInfo = new Player();
    //
    public void initializatePlayer(){
        playerInfo = new Player(DataBasePokemons,DataBaseItems);
    }
    //
    public void iniTializateDataPokemonsAttacks(){
        Attack Attack1Electric = new Attack("Attack 1 Electric",2,100);
        Attack Attack2Electric = new Attack("Attack 2 Electric",2,100);
        Attack Attack3Electric = new Attack("Attack 3 Electric",2,100);
        
        Attack Attack1Water = new Attack("Attack 1 Water",2,100);
        Attack Attack2Water = new Attack("Attack 2 Water",2,100);
        Attack Attack3Water = new Attack("Attack 3 Water",2,100);
        
        Attack Attack1Fire = new Attack("Attack 1 Fire",2,100);
        Attack Attack2Fire = new Attack("Attack 2 Fire",2,100);
        Attack Attack3Fire = new Attack("Attack 3 Fire",2,100);
        
        //agregamos los ataques a la base de datos "la lista pues"
        PokemonAttacksElectric.add(Attack1Electric);
        PokemonAttacksElectric.add(Attack2Electric);
        PokemonAttacksElectric.add(Attack3Electric);
        //
        PokemonsAttackFire.add(Attack1Fire);
        PokemonsAttackFire.add(Attack2Fire);
        PokemonsAttackFire.add(Attack3Fire);
        //
        PokemonsAttackWater.add(Attack1Water);
        PokemonsAttackWater.add(Attack2Water);
        PokemonsAttackWater.add(Attack3Water);
    }
    //
    public void iniTializateDataPokemons(){
        Pokemon Pikachu = new Pokemon("Pikachu","",1,10,PokemonAttacksElectric);
        Pokemon Charmander = new Pokemon("Charmander","",1,10,PokemonsAttackFire);
        Pokemon Squirtle = new Pokemon("Squirtle","",1,10,PokemonsAttackWater);
        
        //agregamos todos los pokemons a la lista
        DataBasePokemons.add(Pikachu);
        DataBasePokemons.add(Charmander);
        DataBasePokemons.add(Squirtle);
    }
    
    public static void main(String[] args) {
        PokemonJava PJ = new PokemonJava();
        PJ.iniTializateDataPokemonsAttacks();
        PJ.iniTializateDataPokemons();
        PJ.initializatePlayer();
        System.err.println("pokemon " + PJ.playerInfo.PlayerPokemons.get(0).NamePokemon);
        //lanzamos la vista del juego para iniciar
        //java.awt.EventQueue.invokeLater(() -> {
            //new Game().setVisible(true); // Lanza la vista específica
        //});
    }
}
