package co.simplon.springjwt.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.simplon.springjwt.entity.RoleEntity;
import co.simplon.springjwt.entity.TodoEntity;
import co.simplon.springjwt.repository.RoleRepository;
import co.simplon.springjwt.repository.TodoRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TodoRepository todoRepository;
    private final RoleRepository roleRepository;

    public DataInitializer(
            TodoRepository todoRepositoryInjected, RoleRepository roleRepositoryInjected) {
        this.todoRepository = todoRepositoryInjected;
        this.roleRepository = roleRepositoryInjected;
    }

    @Override
    public void run(String... args) throws Exception {
        this.todoRepository.save(new TodoEntity("Clone the project", true));
        this.todoRepository.save(new TodoEntity("Test the API", true));
        this.todoRepository.save(new TodoEntity("Add basic authentication"));

        RoleEntity roleUser = new RoleEntity();
        roleUser.setAuthority("ROLE_USER");
        roleRepository.save(roleUser);

        RoleEntity roleAdmin = new RoleEntity();
        roleAdmin.setAuthority("ROLE_ADMIN");
        roleRepository.save(roleAdmin);
    }

}
