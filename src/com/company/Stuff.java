package com.company;

public enum Stuff {
    Chair("кресло",5),
    Table("стол",10),
    Pc("компуктер", 4),
    bed("кровать", 20),
    sofa("диван", 15),
    Lamp("лампа", 5);

    private int S;
    private String type;

    Stuff(String type, int S) {

        this.type = type;
        this.S = S;
    }

    @Override
    public String toString() {

        return type;
    }

    public int getS() {

        return S;
    }
}
