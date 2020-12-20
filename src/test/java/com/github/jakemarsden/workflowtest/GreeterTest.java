package com.github.jakemarsden.workflowtest;

import org.junit.jupiter.api.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void normalGreeting() {
        var clock = Clock.fixed(Instant.parse("2020-11-30T11:30:00Z"), ZoneId.of("GMT"));

        var greeter = new Greeter(clock);
        var actual = greeter.formulateGreeting("John Smith");
        assertEquals("Hello, John Smith!", actual);
    }

    @Test
    void seasonalGreeting() {
        // for most of the world it's not yet December, but it is if we're in New Zealand!
        var clock = Clock.fixed(Instant.parse("2020-11-30T11:30:00Z"), ZoneOffset.ofHours(+13));

        var greeter = new Greeter(clock);
        var actual = greeter.formulateGreeting("John Smith");
        assertEquals("Seasons greetings, John Smith!", actual);
    }
}
