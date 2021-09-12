#Autor: Juan Pablo Patiño Bedoya

@stories

Feature: Academy Choucair

    As a user, i want to learn hoe to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course
        Given than juan wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |

        When he search for the course on the Choucair academy platform
        | strCourse   |
        | <strCourse> |

        Then he finds the course called
        | strCourse   |
        | <strCourse> |

        Examples:
        | strUser    | strPassword   | strCourse               |
        | 1152222069 | Choucair2021* | Metodologia Bancolombia |