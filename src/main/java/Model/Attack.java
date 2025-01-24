/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.font.NumericShaper.Range;

/**
 *
 * @author thela
 */
public class Attack {

    public Attack(String Name, int Power, int Effectiveness) {
        this.Name = Name;
        this.Power = Power;
        this.Effectiveness = Effectiveness;
    }
    protected String Name;
    protected int Power;
    protected int Effectiveness;
}
