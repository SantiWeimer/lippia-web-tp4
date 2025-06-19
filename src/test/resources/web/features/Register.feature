@Register @Regression
Feature: Register

  Background:
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account

  #Case 7
  @RegistroFallido @RegistroContraseñaVacia @RegisterCase7
  Scenario Outline: Registro con campo de contraseña vacio
    And El usuario ingresa el email de registro <email>
    And El usuario hace click en el boton Register
    Then El usuario no puede registrarse y la pagina le indica el error: <error>

    Examples:
      |email                          |error                                      |
      |maildeprueba2@yopmail.com      |Error: Please enter an account password.   |

  #Case 8
  @RegistroFallido @RegistroEmailVacio @RegisterCase8
  Scenario Outline: Registro con campo email y de contraseña vacios
    And El usuario hace click en el boton Register
    Then El usuario no puede registrarse y la pagina le indica el error: <error>

    Examples:
      |error                                          |
      |Error: Please provide a valid email address.   |