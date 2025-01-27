/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thela
 */
public class Pokemon {

    public Pokemon(String NamePokemon,String TypePokemon, int LevelPokemon, int LifePokemon, List<Attack> PokemonAttacks) {
        this.NamePokemon = NamePokemon;
        this.TypePokemon = TypePokemon;
        this.LevelPokemon = LevelPokemon;
        this.LifePokemon = LifePokemon;
        this.PokemonAttacks = PokemonAttacks;
    }
    public int Attack(Attack attack){
        int damage = 0;
        if(LaunchAttack(attack)){
            System.out.println("100%");
            damage = attack.Power;
        }else{
            System.out.println("0%");
            damage = 0;
        }
        return damage;
    }
    public boolean LaunchAttack(Attack attack){
        if(attack.Effectiveness < 1 || attack.Effectiveness > 100){
            throw new IllegalArgumentException("out range");
        }
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        
        return  randomInt <= attack.Effectiveness;
    }
    public int ReceiveAttack(int damage){
        int life = LifePokemon;
        if(LifePokemon > 0){
            life = LifePokemon - damage;
        }else{
            life = 0;
        }
        return life;
    }
    public String TypePokemon;
    public String NamePokemon;
    public int LevelPokemon;
    public int LifePokemon;
    public List<Attack> PokemonAttacks = new ArrayList<>();
}
