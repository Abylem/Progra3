package com.abby.DAO;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.abby.Conexion.ConexionBd;
import com.abby.Entidades.Usuario;

public class ClsUsuario {

	ConexionBd cn = new ConexionBd();
    Connection conexion = cn.RetornarConexion();
    
    public ArrayList<Usuario> MostrarUsuarios(){
    ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            CallableStatement Statement = conexion.prepareCall("call SP_S_Usuarios");
            ResultSet resultadoDeConsulta = Statement.executeQuery();
            while(resultadoDeConsulta.next()){
            Usuario usuario = new Usuario();
            usuario.setIdUsuario(resultadoDeConsulta.getInt("idUsuario"));
            usuario.setUsuario(resultadoDeConsulta.getString("Usuario"));
            usuario.setPassword(resultadoDeConsulta.getString("PassWord"));
            usuario.setId(resultadoDeConsulta.getInt("tipoUsuario"));
            if(usuario.getId() == 2){
                usuarios.add(usuario);
            }
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usuarios;
    }


}
