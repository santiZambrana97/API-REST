package com.example.Config;


import org.hibernate.envers.RevisionListener;

import com.example.Audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
