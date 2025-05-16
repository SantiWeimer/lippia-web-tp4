@Login @Regression
Feature: Login

   @Smoke @LoginExitoso
  Scenario Outline: Login exitoso
    Given El usuario se encuentra en la landing page
    When El usuario hace click en My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    Then El usuario es redirigido al dashboard de My Account donde se muestra su usuario <usuario>
    ##falla el boton de login
    Examples:
    |usuario          |contraseña     |
    |maildeprueba     |maildeprueba   |

  @LoginFallido
  Scenario Outline: Login con usuario y contraseña erroneos
    Given El usuario se encuentra en la landing page
    When El usuario hace click en My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    Then El usuario no puede ingresar y la pagina le indica el error: <error>
    ##falla el boton de login
    ##comprobar el then
    Examples:
      |usuario        |contraseña     |error                                                                                                                                  |
      |maildeprueba2  |maildeprueba2  |Error: The username maildeprueba2 is not registered on this site. If you are unsure of your username, try your email address instead.  |


  @LoginFallido
  Scenario Outline: Login con usuario ingresado y con contraseña vacia
    Given El usuario se encuentra en la landing page
    When El usuario hace click en My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario hace click en el boton Login
    Then El usuario no puede ingresar y la pagina le indica el error: <error>
    ##falla el boton de login
    ##comprobar el then
    Examples:
      |usuario        |error                         |
      |maildeprueba   |Error: Password is required.  |