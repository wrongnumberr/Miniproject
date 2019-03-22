package com.company;

public enum Light {
    Window("окно", 700),
    lightbulb("лампочка", 10);

    private String name;
    private int X;

    Light(String name, int X) {

        this.name = name;
        this.X = X;
    }

    @Override
    public String toString() {

        return name;
    }

    public int getX() {

        return X;
    }

}
