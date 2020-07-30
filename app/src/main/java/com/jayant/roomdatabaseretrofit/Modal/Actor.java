package com.jayant.roomdatabaseretrofit.Modal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "actor", indices = @Index(value = {"id"},unique = true))
public class Actor {
    @PrimaryKey(autoGenerate = true)
    private int actorId;

    @SerializedName("id")
    @ColumnInfo(name = "id")
    private int id;

    @SerializedName("name")
    @ColumnInfo(name = "name")
    private String name;

    @SerializedName("image")
    @ColumnInfo(name = "image")
    private String image;

    @SerializedName("age")
    @ColumnInfo(name = "age")
    private int age;


    public Actor(int id, String name, String image, int age) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", age=" + age +
                '}';
    }
}
