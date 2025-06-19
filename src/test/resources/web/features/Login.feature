@Login @Regression
Feature: Login

   @Smoke @LoginExitoso
  Scenario Outline: Login exitoso
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contrasena>
    And El usuario hace click en el boton Login
    Then El usuario es redirigido al dashboard de My Account donde se muestra su usuario <usuario>

    Examples:
    |usuario          |contrasena     |
    |maildeprueba     |maildeprueba   |

  @LoginFallido @UsuarioErroneo @ContraseñaErronea
  Scenario Outline: Login con usuario y contraseña erroneos
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contrasena>
    And El usuario hace click en el boton Login
    Then El usuario no puede ingresar y la pagina le indica el error: <error>

    Examples:
      |usuario        |contrasena     |error                                                                                                                                  |
      |maildeprueba2  |maildeprueba2  |Error: The username maildeprueba2 is not registered on this site. If you are unsure of your username, try your email address instead.  |


  @LoginFallido @LoginContraseñaVacia
  Scenario Outline: Login con usuario ingresado y con contraseña vacia
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario hace click en el boton Login
    Then El usuario no puede ingresar y la pagina le indica el error: <error>

    Examples:
      |usuario        |error                         |
      |maildeprueba   |Error: Password is required.  |

  ##Case 7
  @LoginFallido @UsuarioEnMayusculas @ContraseñaEnMayusculas @LoginCase7
  Scenario Outline: Login con usuario y contraseña en mayúsculas
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contrasena>
    And El usuario hace click en el boton Login
    Then El usuario no puede ingresar y la pagina le indica el error: <error>

    Examples:
      |usuario          |contrasena     |error                                                                                            |
      |MAILDEPRUEBA     |MAILDEPRUEBA   |Error: The password you entered for the username MAILDEPRUEBA is incorrect. Lost your password?  |

  ##Case 8
  @LoginFallido @LoginCase8
  Scenario Outline: El usuario no puede volver a logearse al apretar el boton atras
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contrasena>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Logout
    And El usuario hace click en el boton atras del navegador
    Then El usuario es redirigido al inicio de sesion

    Examples:
      |usuario          |contrasena     |
      |maildeprueba     |maildeprueba   |