package com.android.settings.chroma;

import com.android.internal.logging.MetricsLogger;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class ChromaSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.chroma_settings);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.CHROMA_SETTINGS;
    }
}
