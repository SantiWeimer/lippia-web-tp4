@MyAccount @Regression
Feature: My Account

  @Smoke @Orders @ComprobateOrders
  Scenario Outline: El usuario puede ver sus pedidos correctamente
    Given El usuario se encuentra en la landing page
    When El usuario hace click en My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Orders
    Then El usuario es redirigido al Orders de My Account donde visualiza sus pedidos
    ##falla el boton de login
    Examples:
      |usuario          |contraseña     |
      |maildeprueba     |maildeprueba   |

  @Smoke @Logout
  Scenario Outline: Logout exitoso
    Given El usuario se encuentra en la landing page
    When El usuario hace click en My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Logout
    Then El usuario es redirigido al inicio de sesion
    ##falla el boton de login
    Examples:
      |usuario          |contraseña     |
      |maildeprueba     |maildeprueba   |