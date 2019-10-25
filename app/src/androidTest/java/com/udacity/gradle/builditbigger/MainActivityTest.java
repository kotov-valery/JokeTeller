package com.udacity.gradle.builditbigger;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.udacity.jokeactivity.JokeActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtraWithKey;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public IntentsTestRule<MainActivity> activityRule =
            new IntentsTestRule<>(MainActivity.class);

    @Test
    public void fetchAJokeTest() {
        onView(withId(R.id.bt_tell_a_joke)).perform(click());

        intended(hasExtraWithKey(JokeActivity.EXTRA_JOKE));
    }
}
