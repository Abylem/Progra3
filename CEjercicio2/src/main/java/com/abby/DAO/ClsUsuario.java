package com.abby.DAO;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.abby.Conexion.ConexionBd;
import com.abby.Entidades.Usuario;

public class ClsUsuario {
	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Usuario> ListadoUSUARIOS() {
		ArrayList<Usuario> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("select u.idUsuario, u.Usuario, u.password,t.TipoUser from usuario as u inner join tipousuario as t where u.tipoUsuario = t.id");
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Usuario user = new Usuario();
				user.setIdUsuario(rs.getInt("u.idUsuario"));
				user.setUsuario(rs.getString("u.Usuario"));
				user.setPassword(rs.getString("u.password"));
				user.setTipoUser(rs.getString("t.TipoUser"));
				Lista.add(user);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}

	public void Eliminar(Usuario user) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_USUER(?)");
			consulta.setInt("pIdUsuario", user.getIdUsuario());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ActualizarUsuario(Usuario user) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_USUARIO(?,?,?)");
			consulta.setString("PUsuario", user.getUsuario());
			consulta.setString("PPass", user.getPassword());
			consulta.setInt("PidUsuario", user.getIdUsuario());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
