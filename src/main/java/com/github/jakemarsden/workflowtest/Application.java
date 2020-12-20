package com.github.jakemarsden.workflowtest;

import java.time.*;

public class Application {

    private static final Clock LOCAL_CLOCK = Clock.system(ZoneId.systemDefault());

    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.exit(1);
            return;
        }
        var greeter = new Greeter(LOCAL_CLOCK);
        var greeting = greeter.formulateGreeting(args[0]);

        System.out.println(greeting);
        System.exit(0);
    }
}
