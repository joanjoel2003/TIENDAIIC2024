package com.Tienda.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="rol")

public class Rol implements Serializable {
     
    /*Esto incrementa nuestros valores en uno el (1L) ¨*/
   private static final long serialVersionUID = 1L;
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_rol")
  private long  idRol;
  
  @NotEmpty
  private String nombre;  
  
  @Column(name="id_usuario")
  private long idUsuario;
  
 /*
 @OneToMany
 @JoinColumn(name="id_usuario")
 List<Usuarios> usuarios;
*/

    public Rol() {
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }
  
 
}
