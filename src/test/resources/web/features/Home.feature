@Home @Regression
Feature: Home

  @Sliders @ComprobarSliders
  Scenario: Comprobar la cantidad de slides en la home page
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton Shop menu
    And El usuario hace click en el boton Home menu
    Then El usuario visualiza solo '3' sliders

  @Arrivals @ComprobarArrivals
  Scenario: Comprobar la cantidad de arrivals en la home page
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton Shop menu
    And El usuario hace click en el boton Home menu
    Then El usuario visualiza solo '3' arrivals
    ##falla el then

  @ComprobarArrivals
  Scenario Outline: Comprobar que el arrival redireccione a la pagina
    Given El usuario se encuentra en la landing page
    When El usuario hace click en el boton Shop menu
    And El usuario hace click en el boton Home menu
    And El usuario hace click en el boton del arrival <nombreArrival>
    Then El usuario es redirigido hacia la pagina de compra de <nombreArrival>
    ##falla el ultimo boton
    ##comprobar el then

    Examples:

    |nombreArrival|
    |Selenium Ruby|