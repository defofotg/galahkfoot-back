package fr.enaiconseil.galahkfoot.authentication.application.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Georges DEFO
 * @date 06/05/2023
 */
@RestController
public class AuthController {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello My friend";
    }
}
