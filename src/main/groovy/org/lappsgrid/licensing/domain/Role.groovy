package org.lappsgrid.licensing.domain

/**
 * @author Keith Suderman
 */
class Role {
    String name

    @Override
    boolean equals(Object object) {
        if (object instanceof Role) {
            return name == ((Role)object).name
        }
    }

    @Override
    int hashCode() {
        return name.hashCode()
    }
}
