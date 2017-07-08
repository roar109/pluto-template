package com.github.roar109.pluto.template.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by hector.mendoza on 07/07/2017.
 */
public abstract class TemplateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
