package cpt.blubber.dagger2androidsample.main;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Module(subcomponents = TestMainComponent.class)
public abstract class TestMainModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bind(TestMainComponent.Builder builder);


}
