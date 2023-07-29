package com.oitavo.usersapi.dto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDTO {
    private String nome;
    private String cpf;
    private String address;
    private String email;
    private String telephone;
    private Date dateRegister;

    //public static List<UserDTO> users = new ArrayList<UserDTO>();

    public UserDTO () {}

    public UserDTO (String nome, String cpf, String address, String email, String telephone, Date dateRegister) {
        this.nome = nome;
        this.cpf = cpf;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.dateRegister = dateRegister;
    }

//    @PostConstruct
//    public void initiateList(){
//        UserDTO userDTO = new UserDTO();
//        userDTO.setNome("Otavio");
//        userDTO.setCpf("123");
//        userDTO.setAddress("Rua A");
//        userDTO.setEmail("teste_otavio@bla.com");
//        userDTO.setTelephone("1232-3232");
//        userDTO.setDateRegister(new Date());
//
//        UserDTO userDTO2 = new UserDTO();
//        userDTO2.setNome("Erika");
//        userDTO2.setCpf("456");
//        userDTO2.setAddress("Rua B");
//        userDTO2.setEmail("erika@bla.com");
//        userDTO2.setTelephone("1232-3232");
//        userDTO2.setDateRegister(new Date());
//
//        UserDTO userDTO3 = new UserDTO();
//        userDTO3.setNome("Isaac");
//        userDTO3.setCpf("789");
//        userDTO3.setAddress("Rua C");
//        userDTO3.setEmail("isaac@bla.com");
//        userDTO3.setTelephone("1232-3232");
//        userDTO3.setDateRegister(new Date());
//
//        users.add(userDTO);
//        users.add(userDTO2);
//        users.add(userDTO3);
//    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getTelephone () {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateRegister () {
        return dateRegister;
    }

    public void setDateRegister (Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDTO userDTO = (UserDTO) o;

        return cpf.equals(userDTO.cpf);
    }

    @Override
    public int hashCode () {
        return cpf.hashCode();
    }
}
