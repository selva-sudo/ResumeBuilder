package com.selvaraj.resumebuilder.adapters;

import androidx.annotation.NonNull;

import com.selvaraj.resumebuilder.datamodel.School;

import java.util.List;

/**
 * Created by selvaraj on 1/19/18.
 */

public class SchoolsAdapter extends ResumeEventAdapter<School> {

    public SchoolsAdapter(@NonNull List<School> list,
                          ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}