package com.example.gttrader.Entity;

public class Player {
    private String name;
    private int[] skill_points;
    private int credits;

    public Player(String name, int[] skill_points) {
        this.name = name;
        this.skill_points = skill_points;
        this.credits = 1000;
    }

    public String getName() {
        return name;
    }

    public int[] getSkill_points() {
        return skill_points;
    }

    public int getCredits() {
        return credits;
    }
}
