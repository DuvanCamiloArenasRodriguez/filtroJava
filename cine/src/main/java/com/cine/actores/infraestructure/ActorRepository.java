package com.cine.actores.infraestructure;

import java.util.List;

import com.cine.actores.domain.models.Actor;

public interface ActorRepository {
    void save(Actor actor);
    void update(Actor actor);
    void delete(int id);
    List<Actor> findAll();
}
