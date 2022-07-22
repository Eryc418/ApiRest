package com.gamesapprest.gamesapprest.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    String nome;
    @NotBlank
    String desenvolvedora;
    @NotBlank
    String empresa;
    @NotBlank
    String anolancamento;
    @NotBlank
    String plataformas;
    @NotBlank
    String preco;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "historia_id")
    Historia historia;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "categoria_id")
    Categoria categoria;

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setDesenvolvedora(String desenvolvedora){
        this.desenvolvedora = desenvolvedora;
    }

    public String getDesenvolvedora(){
        return this.desenvolvedora;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String getEmpresa(){
        return this.empresa;
    }

    public void setAnolancamento(String anolancamento){
        this.anolancamento = anolancamento;
    }

    public String getAnolancamento(){
        return this.anolancamento;
    }

    public void setPlataformas(String plataformas){
        this.plataformas = plataformas;
    }

    public String getPlataformas(){
        return this.plataformas;
    }

    public void setPreco(String preco){
        this.preco = preco;
    }

    public String getPreco(){
        return this.preco;
    }

    public void setHistoria(Historia historia){
        this.historia = historia;
    }

    public Historia getHistoria(){
        return this.historia;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
}
