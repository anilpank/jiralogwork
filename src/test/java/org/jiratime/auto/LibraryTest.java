/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.jiratime.auto;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jiratime.auto.Library;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        classUnderTest.tearDown();
    }
}

