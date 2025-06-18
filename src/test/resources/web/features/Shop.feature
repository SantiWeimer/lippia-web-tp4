@Shop @Regression
Feature: Shop

  #Case 11
  @CompletarDatosDeCompra @ShopCase11
  Scenario: El usuario realiza una compra correctamente desde el shop
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu Shop
    And El usuario hace click en el boton del shop Add to basket
    And El usuario hace click en el boton del menu Basket
    And El usuario hace click en el boton Proceed to checkout
    And El usuario completa los datos de facturación
    And El usuario hace click en el boton Place order
    Then El usuario realiza la compra correctamente