package cpt.blubber.dagger2androidsample;

import android.app.Application;

import cpt.blubber.dagger2androidsample.main.MainModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AndroidModule.class,
                MainModule.class
        }
)
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(AwesomeApplication application);
}
