package org.lappsgrid.licensing.core

import org.lappsgrid.licensing.domain.User


/**
 * @author Keith Suderman
 */
class UserDB {
    Map<String,User> database;

    public UserDB() {
        database = [:]
//        database.with {
//            add(new User("keith", "password"))
//            add(new User("jonathan", "password"))
//        }
    }
    User get(String username) {
        return database.get(username)
    }

    void add(User user) {
        database[user.username] = user
    }

    void load(String path) {
        load(new File(path))
    }

    void load(File file) {
        file.eachLine { line ->
            String[] parts = line.split('$')
        }
    }
}

