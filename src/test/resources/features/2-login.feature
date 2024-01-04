@Suite @Login
Feature: CP02 - Validar login de usuario

  Background: Validar el login de usuario con credenciales validas e invalidas

    Given el usuario navega al sitio web

  @ValidCredentialsLogin
  Scenario: 1 - Validar el login con credenciales correctas
    When ingresa credenciales validas para el login
    Then la aplicion deberia darme acceso a sus funciones

  @InvalidCredentialsLogin
  Scenario: 2 - Validar el login con credenciales incorrectas
    When ingresa credenciales no validas para el login
    Then la aplicacion muestra un mensaje de usuario imvalido
