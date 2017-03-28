package cpt.blubber.dagger2androidsample.greeting;

import dagger.Module;
import dagger.Provides;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Module
public class GreetingModule {

    @Provides
    Greeter provideGreeter(@Greeting String greeting) {
        return new Greeter(greeting);
    }
}
