package com.oitavo.usersapi.dto;

import com.oitavo.usersapi.entity.User;

import java.util.Date;

public class UserDTO {
    private String name;
    private String cpf;
    private String address;
    private String email;
    private String telephone;
    private Date dateRegister;

    public UserDTO () {}

    public UserDTO (String name, String cpf, String address, String email, String telephone, Date dateRegister) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.dateRegister = dateRegister;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
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

    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setAddress(user.getAddress());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelephone(user.getTelephone());
        userDTO.setDateRegister(user.getDateRegister());
        return userDTO;
    }
}
