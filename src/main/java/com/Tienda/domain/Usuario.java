package com.Tienda.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="rol")

public class Usuario implements Serializable {
     
    /*Esto incrementa nuestros valores en uno el (1L) ¨*/
   private static final long serialVersionUID = 1L;
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_usuario")
  private long  idUsuario;
  
  @NotEmpty
  private String username;  
  @NotEmpty 
  private String password;
    private String nombre;
  private  String apellidos;
  private  String correo;
  private  String telefono;
    @Column(name="ruta_imagen")
  private String rutaImagen;
  private boolean activo;
  
  
  @OneToMany
  @JoinColumn(name="id_usuario")
  private List<Rol> roles;
  
  
 /*
 @OneToMany
 @JoinColumn(name="id_usuario")
 List<Usuarios> usuarios;
*/

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
  
 
}
