@MyAccount @Regression
Feature: My Account

  @Smoke @Orders @ComprobarOrders
  Scenario Outline: El usuario puede ver sus pedidos correctamente
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Orders
    Then El usuario es redirigido al Orders de My Account donde visualiza sus pedidos

    Examples:
      |usuario          |contraseña     |
      |maildeprueba     |maildeprueba   |

  #Case 8
  @Smoke @Logout @MyAccountCase8
  Scenario Outline: Logout exitoso
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Logout
    Then El usuario es redirigido al inicio de sesion

    Examples:
      |usuario          |contraseña     |
      |maildeprueba     |maildeprueba   |

  #Case 7
  @AccountDetails @ComprobarAccountDetails @MyAccountCase7
  Scenario Outline: El usuario puede ver los detalles de su cuenta correctamente
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu My Account
    And El usuario ingresa su usuario <usuario>
    And El usuario ingresa su contraseña <contraseña>
    And El usuario hace click en el boton Login
    And El usuario hace click en el boton Account Details
    Then El usuario puede ver los detalles de su cuenta y cambiar su contraseña

    Examples:
      |usuario          |contraseña     |
      |maildeprueba     |maildeprueba   |
