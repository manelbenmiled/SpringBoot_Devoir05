package com.manel.formations.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomForm" , types = {Formation.class})
public interface FormationProjection {
 public String getNomFormation();
}
