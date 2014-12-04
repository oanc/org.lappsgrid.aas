package org.lappsgrid.licensing.domain

import groovy.sql.Sql

class Database {

}

/**
 * @author Keith Suderman
 */
/*
final class Database {
    private static final String DB_PATH = "/usr/share/h2/anc-aas"
    private static final String CONNECT_STRING = "jdbc:h2:%s"
    private static final String DRIVER_NAME = "org.h2.Driver"

    private static Sql database

    // Not allowed.
    private Database() { }


    public static void create() {
        execute """
CREATE TABLE User
(
    id bigint auto_increment,
    name varchar(255),
    salt char(24),
    password varchar(255)
)
"""
        execute """
CREATE TABLE Role
(
    id bigint auto_increment,
    name varchar(255)
)
"""
        execute """
CREATE TABLE UserRole
(
    userId int,
    roleId int
)
"""
    }

    public static void open() {
        open(DB_PATH)
    }

    public static void open(String path) {
        database = Sql.newInstance(String.format(CONNECT_STRING, path), DRIVER_NAME)
    }
    public static void close() {
        //database.commit()
        database.close()
        database = null
    }


    public static void execute(String statement) {
        database.execute(statement)
    }

    public static void drop() {
        execute "DROP TABLE UserRole"
        execute "DROP TABLE Role"
        execute "DROP TABLE User"
    }

    public static void addUser(String name, String password) {

    }
}
*/