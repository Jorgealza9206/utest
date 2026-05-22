#Author: Jorge Alza

@stories
Feature: Registro de usuario Utest
  @scenario1
  Scenario: Registro de Diego en la pagina Utest
    Given Diego desea registrarse en Utest
    When El usuario ingresa los datos requeridos por el sistema
      | strNombre | strApellido | strEmail            | strDiaNacimiento  | strMesNacimiento  | strAnoNacimiento  |
      | Pepito    | Perez       | pepito@utest.com  | 14                | June                | 1947              |
    Then El registro se completa al ver el botón de Complete Setup
