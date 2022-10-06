Feature: Verifier le module register
  En tant que Utilisateur je souhaite remplire le formulaire afin de ma enregistrer

  @module_register
  Scenario Outline: Remplire le formulaire register
    Given Je me connecte sur le siteWeb Mercury
    When Je saisie le first name "<firstname>"
    When Je saisie le last name "<lastname>"
    When Je saisie le phone "<phone>"
    When Je saisie le Email "<Email>"
    When Je saisie le Address "<Address>"
    When Je saisie le City "<City>"
    When Je saisie le State "<State>"
    When Je saisie le code postale "<postale>"
    When Je saisie le Country "<Country>"
    When Je saisie le userName "<username>"
    And Je saisie le password "<password>"
    And Je saisie la confirmation mot de passe "<confirmation>"
    And Je clique sur le boutton Envoyer
    Then Je termine la création du compte "<message>"

    Examples: 
      | firstname| lastname |phone      | Email                   |Address         | City     |State     | postale  |Country |username |password |confirmation  |message                     |
      | Mahmoud  | Eloier   |58811112   | eloier.mahmoud@gmail.com|Monastir Mazdour|Mazdour   | Monastir | 5032    |TUNISIA  |Test     |Test     |Test          |Thank you for registering.  |
      | Laufy    | Escanor  |99666621   |laufy.escanor@gmail.com  |japon           |new japon |jab       | 9123    |TUNISIA  |esca     |esca     |esca          |Thank you for registering.  |
