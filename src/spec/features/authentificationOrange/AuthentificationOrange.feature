@orange
Feature: Authentification sur le site orange
  En Tant que utilisateur je veux m authentifier sur le site orange afin de me connecter sur mon compte

  Background: 
    Given Je me connect au site Orange
    When Je saisie mon userName "Admin"
    And Je saisie mon password "admin123"
    And Je clique sur le boutton login

  @login
  Scenario: connection au site Orange
    Then Je me redirige vers mon compte "PIM"

  @logout
  Scenario: deconnection au site Orange
    When Je clique sur l icone du proprietaire du compte
    When Je clique sur le boutton logout
    Then Je me redirige vers le compte utilisateur "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
