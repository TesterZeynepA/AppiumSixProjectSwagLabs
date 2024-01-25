@GenderPage

Feature: Gender Page Feature
  @Check
  Scenario: Gender Page Test Case 1
    Given user is on the Gender Page
    Then should see Image on Gender Page
    Then should see Close Button on Gender Page
    Then should see Erkek Button: "ERKEK" on Gender Page
    Then should see Kadin Button: "KADIN" on Gender Page
    Then should see Text: "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?" on Gender Page

  Scenario: Check Erkek Button Navigate to Offer Page
    Given user is on the Gender Page
    When click Erkek Button on Gender Page
    Then should see Offer Page

  Scenario: Check Kadin Button Navigate to Offer Page
    Given user is on the Gender Page
    When click Kadin Button on Gender Page
    Then should see Offer Page

  Scenario: Check Close Button Navigate to Offer Page
    Given user is on the Gender Page
    When click Close Button on Gender Page
    Then should see Offer Page