package com.company;

public class Room {

    private Light light;
    private Stuff stuff;

    private Room(Builder builder){

        this.light = builder.light;
        this.stuff = builder.stuff;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Комната 1")
                .append(" Освещеность = ")
                .append(light.getX())
                .append("мебель:")
                .append(stuff.toString());
        return sb.toString();
    }

    public static class Builder {

        private Light light;
        private Stuff stuff;
    }

    public Builder addStuff(Stuff stuff){
        this.stuff = stuff;
        return this;
    }

    public Builder addLight(Light light){
        this.light = light;
        return this;
    }

}
