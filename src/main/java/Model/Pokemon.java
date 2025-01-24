/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.ArrayList;

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
    public String TypePokemon;
    public String NamePokemon;
    public int LevelPokemon;
    public int LifePokemon;
    public List<Attack> PokemonAttacks = new ArrayList<>();
}
