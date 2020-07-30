package com.jayant.roomdatabaseretrofit.ViewModal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.jayant.roomdatabaseretrofit.Modal.Actor;
import com.jayant.roomdatabaseretrofit.Repository.ActorRespository;

import java.util.List;

public class ActorViewModal extends AndroidViewModel {

    private ActorRespository actorRespository;
    private LiveData<List<Actor>> getAllActors;

    public ActorViewModal(@NonNull Application application) {
        super(application);
        actorRespository=new ActorRespository(application);
        getAllActors=actorRespository.getAllActors();
    }

    public void insert(List<Actor> list)
    {
        actorRespository.insert(list);
    }

    public LiveData<List<Actor>> getAllActor()
    {
        return getAllActors;
    }

}
