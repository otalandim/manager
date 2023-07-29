package com.oitavo.usersapi.dto;

import java.util.Date;

public class UserDTO {
    private String nome;
    private String cpf;
    private String address;
    private String email;
    private String telephone;
    private Date dateRegister;

    public UserDTO () {}

    public UserDTO (String nome, String cpf, String address, String email, String telephone, Date dateRegister) {
        this.nome = nome;
        this.cpf = cpf;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.dateRegister = dateRegister;
    }

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
