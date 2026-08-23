package co.simplon.springjwt.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String id;

    @Nonnull
    @Column(nullable = false)
    public String title;

    @Nonnull
    @Column(columnDefinition = "BOOLEAN DEFAULT false", nullable = false)
    public Boolean done = false;

    public TodoEntity() {
    }

    public TodoEntity(String title) {
        this.title = title;
    }

    public TodoEntity(String title, Boolean done) {
        this.title = title;
        this.done = done == null ? false : done;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return this.done;
    }

    public void setDone(Boolean done) {
        this.done = done == null ? false : done;
    }

    @Override
    public String toString() {
        return String.format("Todo: { id='%s', title='%s', done='%s' }", getId(), getTitle(), getDone());
    }

}