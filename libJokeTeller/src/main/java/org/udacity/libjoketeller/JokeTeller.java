package org.udacity.libjoketeller;

import java.util.Random;

public class JokeTeller {

    private static final String[] jokes = {
            "I told my girlfriend she drew her eyebrows too high. She seemed surprised.",
            "I'm so good at sleeping. I can do it with my eyes closed.",
            "My boss told me to have a good day.. so I went home.",
            "Why is Peter Pan always flying? He neverlands.",
            "I couldn't figure out why the baseball kept getting larger. Then it hit me.",
            "Why did the old man fall in the well? Because he couldn't see that well.",
            "A blind man walks into a bar. And a table. And a chair.",
            "Parallel lines have so much in common. It’s a shame they’ll never meet."
    };

    public static String tellJoke() {
        Random rand = new Random();
        int n = rand.nextInt(jokes.length);
        return jokes[n];
    }
}
