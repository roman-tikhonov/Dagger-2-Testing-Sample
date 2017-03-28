package cpt.blubber.dagger2androidsample.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */

@Subcomponent(modules = {FakeGreetingModule.class})
public interface TestMainComponent extends MainComponent {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }

}
