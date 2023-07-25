package ClothifyStore.icet.demo.controller;

import ClothifyStore.icet.demo.entity.User;
import ClothifyStore.icet.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo repo;

    @PostMapping
    public User adduser(@RequestBody User user){
        User saveuser=repo.save(user);
        System.out.println("this is add post");
        return saveuser;

    }
    @GetMapping
    public List<User> getStudent(){
        return repo.findAll();
    }
//    {
//        "id":1,
//            "address":"godawela",
//            "email":"sa@gmail.com",
//            "name":"samitha",
//            "number":"0768069473",
//            "password":"123"
//    }




}
