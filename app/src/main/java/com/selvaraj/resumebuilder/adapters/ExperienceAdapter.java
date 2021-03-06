package com.selvaraj.resumebuilder.adapters;

import androidx.annotation.NonNull;

import com.selvaraj.resumebuilder.datamodel.Experience;

import java.util.List;

/**
 * Created by selvaraj on 1/19/18.
 */

public class ExperienceAdapter extends ResumeEventAdapter<Experience> {

    public ExperienceAdapter(@NonNull List<Experience> list,
                             ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}
