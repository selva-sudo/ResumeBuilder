package com.selvaraj.resumebuilder.adapters;

import androidx.annotation.NonNull;
import android.view.View;

import com.selvaraj.resumebuilder.datamodel.Project;

import java.util.List;

/**
 * Created by selvaraj on 1/19/18.
 */

public class ProjectsAdapter extends ResumeEventAdapter<Project> {

    public ProjectsAdapter(@NonNull List<Project> list,
                           ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }

    @Override
    protected void updateViewHolder(ResumeEventAdapterViewHolder viewHolder) {
        viewHolder.subtitle.setVisibility(View.GONE);
    }
}