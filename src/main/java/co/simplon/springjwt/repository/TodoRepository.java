package co.simplon.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.springjwt.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

}
