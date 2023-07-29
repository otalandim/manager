package com.oitavo.usersapi.controller;

import com.oitavo.usersapi.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    public static List<UserDTO> users = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList(){
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Otavio");
        userDTO.setCpf("123");
        userDTO.setAddress("Rua A");
        userDTO.setEmail("teste_otavio@bla.com");
        userDTO.setTelephone("1232-3232");
        userDTO.setDateRegister(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setName("Erika");
        userDTO2.setCpf("456");
        userDTO2.setAddress("Rua B");
        userDTO2.setEmail("erika@bla.com");
        userDTO2.setTelephone("1232-3232");
        userDTO2.setDateRegister(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setName("Isaac");
        userDTO3.setCpf("789");
        userDTO3.setAddress("Rua C");
        userDTO3.setEmail("isaac@bla.com");
        userDTO3.setTelephone("1232-3232");
        userDTO3.setDateRegister(new Date());

        users.add(userDTO);
        users.add(userDTO2);
        users.add(userDTO3);
    }

    @GetMapping("/")
    public String getMessage(){
        return "Spring boot is working!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return users;
    }

    @GetMapping("/users/{cpf}")
    public UserDTO getUserByCpf(@PathVariable String cpf) {
        for (UserDTO user: users){
            if (user.getCpf().equals(cpf)){
                return user;
            }
        }
        return null;
    }

    @PostMapping("/newUser")
    public UserDTO add(@RequestBody UserDTO userDTO) {
        userDTO.setDateRegister(new Date());
        users.add(userDTO);
        return userDTO;
    }

    @DeleteMapping("/user/{cpf}")
    public boolean remove(@PathVariable String cpf) {
        for (UserDTO user: users){
            if (user.getCpf().equals(cpf)){
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}
