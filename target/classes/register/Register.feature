Feature: Je remplir complètement le formulaire
  En tant que utilisateur je souhaite me créer mon compte au site Mercury

  @creation
  Scenario: Je remplir complètement le formulaire
    Given Je me connecte sur le siteWeb Mercury
    When Je saisie le first name "Mahmoud"
    When Je saisie le last name "Eloier"
    When Je saisie le phone "58811112"
    When Je saisie le Email "eloier.mahmoud@gmail.com"
    When Je saisie le Address "Monastir Mazdour"
    When Je saisie le City "Mazdour"
    When Je saisie le State "Monastir"
    When Je saisie le code postale "5032"
    When Je saisie le Country "TUNISIA"
    When Je saisie le userName "Test"
    And Je saisie le password "Test"
    And Je saisie la confirmation mot de passe "Test"
    And Je clique sur le boutton Envoyer 
    Then Je termine la création du compte "Thank you for registering."