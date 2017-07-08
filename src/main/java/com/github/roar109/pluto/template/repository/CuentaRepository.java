package com.github.roar109.pluto.template.repository;

import com.github.roar109.pluto.template.dto.CuentaTemplate;

import javax.ejb.Stateless;

/**
 * Created by hector.mendoza on 07/07/2017.
 */

@Stateless
public class CuentaRepository extends TemplateRepository {

    public CuentaTemplate save(final CuentaTemplate cuentaTemplate){
        getEntityManager().persist(cuentaTemplate);
        return cuentaTemplate;
    }

    public CuentaTemplate getById(final Integer id){
        return getEntityManager().find(CuentaTemplate.class, id);
    }

    public CuentaTemplate cloneTemplate(final Integer id){
       final CuentaTemplate baseTemplate = getById(id);
       return save(new CuentaTemplate(baseTemplate));
    }

    public void publish(final Integer id){
        final CuentaTemplate baseTemplate = getById(id);
        //save template into cuenta
        //Send message to the other WAR to save it
    }
}
