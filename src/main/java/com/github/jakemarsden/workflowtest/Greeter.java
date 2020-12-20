package com.github.jakemarsden.workflowtest;

import java.time.*;

import static java.lang.String.*;

class Greeter {

    private final Clock clock;

    Greeter(Clock clock) {
        this.clock = clock;
    }

    public String formulateGreeting(String name) {
        var now = LocalDate.now(clock);
        if (now.getMonth() == Month.DECEMBER) {
            return format("Seasons greetings, %s!", name);
        } else {
            return format("Hello, %s!", name);
        }
    }
}
