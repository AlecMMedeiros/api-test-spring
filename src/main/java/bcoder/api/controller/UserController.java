package bcoder.api.controller;

import bcoder.api.model.UserModel;
import bcoder.api.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
  private final UserRepository repository;

  public UserController ( UserRepository repository ) {
    this.repository = repository;
  }

  @GetMapping()
  public List<UserModel> getUsers (){
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public void getUserById ( @PathVariable("id") Integer id){
    repository.findById(id);
  }

  @PostMapping()
  public void createUser (@RequestBody UserModel newUser){
    repository.save(newUser);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable("id") Integer id) {
    repository.deleteById(id);
  }



}
