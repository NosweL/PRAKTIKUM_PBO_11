/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Zombie implements Destroyable {

    public int health;
    public int level;

    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "Health = " + health
                + "\nLevel = " + level;
    }
}
