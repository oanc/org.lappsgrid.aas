package org.lappsgrid.licensing.domain

import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * @author Keith Suderman
 */
class DatabaseTests {


    @Before
    void setUp() {
        Database.open("/tmp/aas-test")
        Database.create()
    }

    @After
    void cleanUp() {
        Database.drop()
        Database.close()
    }

    @Test
    void testCreate() {
        Database.create()
    }
}
