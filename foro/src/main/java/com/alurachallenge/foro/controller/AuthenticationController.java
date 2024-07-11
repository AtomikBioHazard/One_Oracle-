package com.alurachallenge.foro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alurachallenge.foro.dto.DatosAutenticacion;
import com.alurachallenge.foro.dto.DatosTokenJWT;
import com.alurachallenge.foro.infra.security.TokenService;
import com.alurachallenge.foro.model.Usuario;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private TokenService tokenService;

  @PostMapping
  public ResponseEntity realizarLogin(
    @RequestBody @Valid DatosAutenticacion datosAutenticacion) {
    var authenticationToken = new UsernamePasswordAuthenticationToken(datosAutenticacion.username(),
        datosAutenticacion.password());

      var autenticacion = authenticationManager.authenticate(authenticationToken);
      var tokenJWT = tokenService.generarToken((Usuario) autenticacion.getPrincipal());

      return ResponseEntity.ok(new DatosTokenJWT(tokenJWT));
    }
}
