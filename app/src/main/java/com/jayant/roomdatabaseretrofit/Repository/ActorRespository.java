package com.jayant.roomdatabaseretrofit.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.jayant.roomdatabaseretrofit.Dao.ActorDao;
import com.jayant.roomdatabaseretrofit.Database.ActorDatabase;
import com.jayant.roomdatabaseretrofit.Modal.Actor;

import java.util.List;

public class ActorRespository {
    private ActorDatabase database;
    private LiveData<List<Actor>> getAllActors;

    public ActorRespository(Application application)
    {
        database=ActorDatabase.getInstance(application);
        getAllActors=database.actorDao().getAllActors();
    }

    public void insert(List<Actor> actorList){
     new InsertAsynTask(database).execute(actorList);
    }

    public LiveData<List<Actor>> getAllActors()
    {
        return getAllActors;
    }

   static class InsertAsynTask extends AsyncTask<List<Actor>,Void,Void>{
        private ActorDao actorDao;
         InsertAsynTask(ActorDatabase actorDatabase)
         {
             actorDao=actorDatabase.actorDao();
         }
        @Override
        protected Void doInBackground(List<Actor>... lists) {
             actorDao.insert(lists[0]);
            return null;
        }
    }
}
