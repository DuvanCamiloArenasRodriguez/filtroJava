package com.cine.actores.application;

import com.cine.actores.domain.models.Actor;

import com.cine.actores.infraestructure.ActorRepository;

import java.util.List;

public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public void createActor(Actor actor) {
        actorRepository.save(actor);
    }

    public void updateActor(Actor actor) {
        actorRepository.update(actor);
    }

    public void deleteActor(int id) {
        actorRepository.delete(id);
    }

    public List<Actor> getAllActores() {
        return actorRepository.findAll();
    }
}






