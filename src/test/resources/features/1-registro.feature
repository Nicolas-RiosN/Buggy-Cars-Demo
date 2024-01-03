Feature: CP01 - Validar registro de usuario

  Background: Validar el registro de usuario con parametros validos y parametros invalidos

    Given el usuario navega al sitio web

    Scenario: 1 - Validar un registro con credenciales correctas
      When ingresa credenciales validas
      Then la aplicacion deberia dar un mensaje de registro exitoso

    Scenario: 2 - Validar con credenciales repetidas
      When ingresa credenciales ya existentes
      Then la aplicacion muestra un mensaje de usuario existente

    Scenario: 3 - Validar un registro con credenciales incorrectas
      When ingresa credenciales no validas
      Then la aplicacion muestra un mensaje de error