package net.javaguides.ems.entity;

public @interface column {

    String name();

    boolean nullable();

    boolean unique();

}
