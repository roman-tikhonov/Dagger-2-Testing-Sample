package cpt.blubber.dagger2androidsample.main;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import cpt.blubber.dagger2androidsample.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInjection() {
        onView(withId(R.id.greeting)).check(matches(withText(FakeGreetingModule.TEST_VALUE)));
    }

}