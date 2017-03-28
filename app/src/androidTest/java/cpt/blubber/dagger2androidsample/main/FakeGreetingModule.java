package cpt.blubber.dagger2androidsample.main;

import cpt.blubber.dagger2androidsample.greeting.Greeter;
import dagger.Module;
import dagger.Provides;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Module
public class FakeGreetingModule {

    public static String TEST_VALUE = "test";

    @Provides
    Greeter provideMockedGreeter() {
        return new Greeter(TEST_VALUE);
    }
}
