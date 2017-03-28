package cpt.blubber.dagger2androidsample.main;

import cpt.blubber.dagger2androidsample.greeting.GreetingModule;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Subcomponent(modules = {GreetingModule.class})
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }

}
