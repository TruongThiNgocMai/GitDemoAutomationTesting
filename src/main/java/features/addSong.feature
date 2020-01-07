Feature: Find the name of the song

  Scenario Outline: Find the name of the song
    Given I open website <website>
    When I type name as <name>
    And I click search button
    Then I verify the song is display

    Examples:
      | website                        | name             |
      | https://www.youtube.com/?gl=VN | sweet but psycho |

