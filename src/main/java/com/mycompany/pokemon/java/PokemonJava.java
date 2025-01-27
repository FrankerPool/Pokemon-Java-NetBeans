/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokemon.java;

import Model.Attack;
import Model.Item;
import Model.Player;
import Model.Pokemon;
import Views.GameTitle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author thela
 */
public class PokemonJava {
    
    //lista con todos los pokemons - agregados manualmente
    public List<Pokemon> DataBasePokemons = new ArrayList<>();
    //pokemons seleccionados de manera aleatoria
    public List<Pokemon> SelectedPokemons = new ArrayList<>();
    //necesitamos tambien items
    public List<Item> DataBaseItems = new ArrayList<>();
    //lista de los ataques disponibles para todos los pokemons electricos
    public List<Attack> PokemonAttacksElectric = new ArrayList<>();
    public List<Attack> PokemonsAttackFire = new ArrayList<>();
    public List<Attack> PokemonsAttackWater = new ArrayList<>();
    //
    //si se puede tener un equipo con los mismos pokemons
    public Player selectPokemons(int sizeTeam, Player playerData, String playerName){
        //obtengo un numero del 0 al tamaño de el array
        for (int i = 0; i < sizeTeam; i++) {
            int RandomIDPokemon = (int) (Math.random() * DataBasePokemons.size());
            Pokemon randomPokemon = DataBasePokemons.get(RandomIDPokemon);
            SelectedPokemons.add(randomPokemon);
        }
            playerData = new Player(playerName,SelectedPokemons,DataBasePokemons,DataBaseItems);
            return playerData;
    }
    //print info
    public void debugInfoPlayer(Player playerData){
        System.err.println("Trainer - "+playerData.NamePlayer);
    }
    //
    public void iniTializateDataPokemonsAttacks(){
        Attack Attack1Electric = new Attack("Bolt Beak",2,50);
        Attack Attack2Electric = new Attack("Bolt Strike",2,50);
        Attack Attack3Electric = new Attack("Buzzy Buzz",2,50);
        Attack Attack4Electric = new Attack("Charge",8,50);
        Attack Attack5Electric = new Attack("Charge Beam",10,50);
        Attack Attack6Electric = new Attack("Discharge",15,100);
        
        Attack Attack1Water = new Attack("Aqua Cutter",2,50);
        Attack Attack2Water = new Attack("Aqua Jet",2,50);
        Attack Attack3Water = new Attack("Aqua Ring",2,50);
        Attack Attack4Water = new Attack("Hydro Pump",8,50);
        Attack Attack5Water = new Attack("Hydro Steam",10,50);
        Attack Attack6Water = new Attack("Jet Punch",15,100);
        
        Attack Attack1Fire = new Attack("Burn Up",2,50);
        Attack Attack2Fire = new Attack("Burning Bulwark",2,50);
        Attack Attack3Fire = new Attack("Burning Jealousy",2,50);
        Attack Attack4Fire = new Attack("Ember",8,50);
        Attack Attack5Fire = new Attack("Eruption",10,50);
        Attack Attack6Fire = new Attack("Fiery Dance",15,100);
        
        //agregamos los ataques a la base de datos "la lista pues"
        PokemonAttacksElectric.add(Attack1Electric);
        PokemonAttacksElectric.add(Attack2Electric);
        PokemonAttacksElectric.add(Attack3Electric);
        PokemonAttacksElectric.add(Attack4Electric);
        PokemonAttacksElectric.add(Attack5Electric);
        PokemonAttacksElectric.add(Attack6Electric);
        //
        PokemonsAttackFire.add(Attack1Fire);
        PokemonsAttackFire.add(Attack2Fire);
        PokemonsAttackFire.add(Attack3Fire);
        PokemonsAttackFire.add(Attack4Fire);
        PokemonsAttackFire.add(Attack5Fire);
        PokemonsAttackFire.add(Attack6Fire);
        //
        PokemonsAttackWater.add(Attack1Water);
        PokemonsAttackWater.add(Attack2Water);
        PokemonsAttackWater.add(Attack3Water);
        PokemonsAttackWater.add(Attack4Water);
        PokemonsAttackWater.add(Attack5Water);
        PokemonsAttackWater.add(Attack6Water);
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
        
        PokemonJava ManagerGame = new PokemonJava();
        //info del jugador y el enemigo
        ManagerGame.iniTializateDataPokemonsAttacks();
        ManagerGame.iniTializateDataPokemons();
        Player playerInfo = new Player();
        Player enemyInfo = new Player();
        playerInfo = ManagerGame.selectPokemons(3,playerInfo,"Azul");
        enemyInfo = ManagerGame.selectPokemons(3,enemyInfo,"Rojo");;
        ManagerGame.debugInfoPlayer(playerInfo);
        ManagerGame.debugInfoPlayer(enemyInfo);
        
        playerInfo.SelectedPokemons.get(0).Attack(playerInfo.SelectedPokemons.get(0).PokemonAttacks.get(0));
        //lanzamos la vista del juego para iniciar
        java.awt.EventQueue.invokeLater(() -> {
            new GameTitle().setVisible(true); // Lanza la vista específica
        });
    }
}
