/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinitycore.sniffexplorer.game.entities;

/**
 *
 * @author chaouki
 */
public class Creature extends Unit implements IdentifiableByEntry {

    private Integer entry;

    public Creature() {
    }

    public Creature(Integer entry, String GUID) {
        super(GUID);
        this.entry = entry;
    }

    @Override
    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    @Override
    public Integer getEntry() {
        return entry;
    }

    public void Integer(Integer entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Creature. Entry= " + entry + " GUID= "+GUID;
    }
    
    
}
