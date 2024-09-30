// File: Ex03JUnitPlatformExample.java
// Package: com.coherentsolutions.advanced.java.section01

package com.coherentsolutions.advanced.java.section01;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

/**
 * Ex03JUnitPlatformExample
 *
 * This class demonstrates how to programmatically launch JUnit 5 tests using the JUnit Platform.
 * It discovers and executes tests in the specified class and prints a summary of the test results.
 */
public class Ex03JUnitPlatformExample {

    public static void main(String[] args) {
        // Create a launcher for the JUnit Platform
        Launcher launcher = org.junit.platform.launcher.core.LauncherFactory.create();

        // Create a listener to collect test execution summaries
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        // Build a discovery request for the specified test class
        LauncherDiscoveryRequest request = org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectClass(Ex01BasicJUnit5Test.class))
                .build();

        // Execute the tests
        launcher.execute(request, listener);

        // Print the summary of test results
        listener.getSummary().printTo(new java.io.PrintWriter(System.out));
    }
}
