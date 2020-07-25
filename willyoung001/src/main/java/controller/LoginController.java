package controller;

import service.LoginService;

public class LoginController {

    private LoginService loginService;

    public String helloWorld(){
        return loginService.helloWorld();
    }
}
