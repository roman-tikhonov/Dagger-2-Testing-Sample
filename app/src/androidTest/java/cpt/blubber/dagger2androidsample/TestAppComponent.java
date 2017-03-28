package cpt.blubber.dagger2androidsample;

import cpt.blubber.dagger2androidsample.main.TestMainModule;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AndroidModule.class,
                TestMainModule.class
        }
)
public interface TestAppComponent extends AppComponent {

    void inject(TestApplication application);

}
