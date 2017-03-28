package cpt.blubber.dagger2androidsample;

import android.app.Application;
import android.content.res.Resources;

import cpt.blubber.dagger2androidsample.greeting.Greeting;
import dagger.Module;
import dagger.Provides;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Module
public class AndroidModule {

    @Provides
    Resources provideResources(Application application) {
        return application.getResources();
    }

    @Provides
    @Greeting
    String provideGreeting(Resources resources) {
        return resources.getString(R.string.hello_world);
    }

}
