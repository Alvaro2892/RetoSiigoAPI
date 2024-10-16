Feature: Crear un usuario en Regres.In
  Como usuario quiero crear un nuevo usuario en la pagina Regres.In
  para verificar el correcto funcionamiento delos servicios

  Scenario: Creacion de usuarios
    When el usuario crea un usuario
      | name   | job  |
      | Alvaro | test |
    Then deberia ver un mensaje de usuario creado y codigo de respuesta adecuado