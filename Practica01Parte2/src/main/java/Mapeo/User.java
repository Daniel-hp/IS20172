/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jonathan
 */
@Entity
@Table(name="user")
public class User {
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id_user;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "password")
    private String password;
   
    @Column(name = "persona_id")
    private String persona_id;
    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonaId() {
        return persona_id;
    }

    public void setPersonaId(String persona_id) {
        this.persona_id = persona_id;
    }

    
    
    
    
}