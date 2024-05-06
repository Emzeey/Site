package org.example;

import database.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connect("jdbc:sqlite:identifier.sqlite");

    }
}