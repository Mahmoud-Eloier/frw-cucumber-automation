Feature: Verifier le module register
  En tant que Utilisateur je souhaite remplire le formulaire afin de ma enregistrer

  @module_register
  Scenario Outline: Remplire le formulaire register
    Given Je me connecte sur le site Mercury
    When Je click sur le module register
    And Je saisie un data dans le champ username "<username>"
    And Je saisie un data dans le champ lastname "<lastname>"

    Examples: 
      | username | lastname |
      | Mahmoud  | Eloier   |
      | Laufy    | Escanor  |
