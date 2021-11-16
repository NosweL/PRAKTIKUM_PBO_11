/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Barrier implements Destroyable {

    private int strength;

    Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength = " + getStrength();
    }

    @Override
    public void destroyed() {
        strength = (strength - 2 / 100 * strength);
    }
}
