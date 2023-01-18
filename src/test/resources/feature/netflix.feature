# language: es
Característica: Ingresar a la web de netflix maximizar la pantalla e imprimir titulos

  @test
  Escenario: Ingresar a netlfix
    Dado "usuario" navega a la pagina principal
    Cuando el selecciona la opcion
    Y el obtiene el titulo de 3 peliculas
    Entonces el usuario visualiza las peliculas "Tendencias"

