@Shop @Regression
Feature: Shop

  Background:
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu Shop

  #Case 11
  @ComprarProducto @ComprarProductoDesdeShop @ShopCase11
  Scenario: El usuario realiza una compra correctamente desde el shop
    And El usuario hace click en el boton del shop Add to basket
    And El usuario hace click en el boton del menu Basket
    And El usuario hace click en el boton Proceed to checkout
    And El usuario completa los datos de facturación
    And El usuario hace click en el boton Place order
    Then El usuario realiza la compra correctamente

  #Case 12
  @ComprobarTaxes @ShopCase12
  Scenario Outline: El usuario visualiza el tax correspondiente a su pais
    And El usuario hace click en el boton del shop Add to basket
    And El usuario hace click en el boton del menu Basket
    And El usuario hace click en el boton Proceed to checkout
    And El usuario cambia su ubicación a <pais>
    Then El usuario visualiza el tax correspondiente a su pais

    Examples:
    |pais        |
    |Hungary     |