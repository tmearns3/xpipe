package io.xpipe.app.prefs;

import io.xpipe.app.fxcomps.Comp;

public abstract class AppPrefsCategory {

    protected boolean show() {
        return true;
    }

    protected abstract String getId();

    protected abstract Comp<?> create();
}
