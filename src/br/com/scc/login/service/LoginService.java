/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scc.login.service;

import br.com.scc.login.bean.LoginBean;
import br.com.scc.login.dao.loginDAO;

/**
 *
 * @author Adriana
 */
public class LoginService {
    
    public String logar(String email,String senha){
        if(senha==null || senha==""||email==null||email==""){
            return "";
        }else{
            String perfil="";
            loginDAO dao = new loginDAO();
            LoginBean bean = dao.getLoginUsuario(email);
            if(bean!=null){
                if(bean.getSenha().equals(senha)){
                    return bean.getPerfil();
                }
            }else{
                perfil="";
            }
            return perfil;
        }
    }
}
