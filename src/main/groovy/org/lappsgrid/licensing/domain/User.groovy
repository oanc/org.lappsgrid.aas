package org.lappsgrid.licensing.domain

import org.lappsgrid.licensing.core.SecurityManager

/**
 * @author Keith Suderman
 */
class User {
    String username
    String salt
    String password

    public User(String name, String password) {
        this.username = name
        this.salt = SecurityManager.getSalt()
        this.password = SecurityManager.hash(salt + password)
    }

    /* Used when loading users from a file. */
    public User(String name, String salt, String hashedPassword) {
        this.username = name
        this.salt = salt
        this.password = hashedPassword
    }

    boolean checkPassword(String password) {
        return this.password == SecurityManager.hash(salt + password)
    }
}
