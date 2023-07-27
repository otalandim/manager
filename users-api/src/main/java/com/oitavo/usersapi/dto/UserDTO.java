package com.oitavo.usersapi.dto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDTO {
    private  String nome;
    private  String cpf;
    private  String endereco;
    private  String email;
    private  String telefone;
    private  Date dataCadastro;

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();

    public UserDTO () {}

    public UserDTO (String nome, String cpf, String endereco, String email, String telefone, Date dataCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    @PostConstruct
    public void initiateList(){
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Otavio");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua A");
        userDTO.setEmail("teste_otavio@bla.com");
        userDTO.setTelefone("1232-3232");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO.setNome("Erika");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua A");
        userDTO.setEmail("teste_otavio@bla.com");
        userDTO.setTelefone("1232-3232");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO.setNome("Isaac");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua A");
        userDTO.setEmail("teste_otavio@bla.com");
        userDTO.setTelefone("1232-3232");
        userDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
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

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public Date getDataCadastro () {
        return dataCadastro;
    }

    public void setDataCadastro (Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
