Feature: Je réserve un vol 
  En tant que utilisateur je souhaite me connecter au site Mercury

  @flight
  Scenario: Je réserve un vol 
    Given Je me connecte sur le site Mercury Flight
    When Je choisi le type de vol "Round Trip"
    And Je choisi le nombre de passagers "1"
    And Je choisi le point de depart "London"
    And Je choisi le mois de depart "July"
    And Je choisi le jour de depart "1"
    And Je choisi le point darriver "Paris"
    And Je choisi le mois de retour "October"
    And Je choisi le jour de retour "1"
    And Je choisi le classe "First class"
    And Je choisi la compagnie aerienne "Pangea Airlines"
    And Je clique sur le boutton continue 
    Then Je me redirige vers la page de reservation "https://demo.guru99.com/test/newtours/reservation2.php"