Feature: About Urban 
I am about to sell kid's chair

Scenario Outline: Open the Website UrbanLadder
Given I hover on the Kid's Room
Then I select Kid's Chair
Then I click Chable chair Electric blue
Then I click Add to Cart
Then I change zip code and click checkout
And the values are : "<Email>","<Pin Code>","<Address>","<First Name>","<Last Name>" and "<Mobile Number>"

Examples:
| Email | Pin Code | Address | First Name | Last Name | Mobile Number |
| debanikkundu23@gmail.com| 400037 | Antop Hill, Mumbai | Debanik | Kundu | 9769256534 |