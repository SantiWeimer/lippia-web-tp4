@Home @Regression
Feature: Home

  Background:
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton del menu Shop
    And El usuario hace click en el boton del menu Home

  @Sliders @ComprobarSliders
  Scenario: Comprobar la cantidad de slides en la home page
    Then El usuario visualiza solo '3' sliders

  @Arrivals @ComprobarArrivals
  Scenario: Comprobar la cantidad de arrivals en la home page
    Then El usuario visualiza solo '3' arrivals

  #@ComprobarArrivals
  Scenario Outline: Comprobar que el arrival redireccione a la pagina
    And El usuario hace click en el boton del primer arrival
    Then El usuario es redirigido hacia la pagina de compra de <nombreArrival>
    ##falla el ultimo boton
    ##comprobar el then

    Examples:

    |nombreArrival|
    |Selenium Ruby|

  #Case 17
  @CompletarDatosDeCompra @HomeCase17
  Scenario: El usuario puede completar los datos de facturación correctamente
    And El usuario hace click en el boton del primer arrival
    And El usuario hace click en el boton Add to basket
    And El usuario hace click en el boton del menu Basket
    And El usuario hace click en el boton Proceed to checkout
    Then El usuario visualiza la pagina de checkout correctamente
    And El usuario puede completar los datos de facturación

  #Case 18
  @ComprarProducto @ComprarProductoDesdeHome @HomeCase18
  Scenario: El usuario realiza una compra correctamente desde el home
    And El usuario hace click en el boton del primer arrival
    And El usuario hace click en el boton Add to basket
    And El usuario hace click en el boton del menu Basket
    And El usuario hace click en el boton Proceed to checkout
    And El usuario completa los datos de facturación
    And El usuario hace click en el boton Place order
    Then El usuario realiza la compra correctamente

