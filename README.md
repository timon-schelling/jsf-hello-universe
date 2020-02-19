# Task OK internship: Backend functionality should be implemented, which enables user administration (English Version, [German Version](#objektmodell))
## object model:
- there are users, user permissions and user groups
## architecture:
- There is a repository for reading and writing users, user permissions and user groups
- Users contain user permissions and user groups
- Permissions have a name
- User Groups Contain User Permissions
### acceptance criteria:
- The service class provides the following functions
    - Create a user
    - Remove a user
    - Query all users
    - Create a permission
    - remove a permission
    - Query all permission
    - Query all permission of a user
    - Add permissions to a user
    - Remove a user's permissions
    - Add a user group
    - Remove a user group
    - Add permissions to a user group
    - Remove permissions from a user group
    - Query all permission of a user group
    - Add user groups to a user
    - Remove a user user group
- There is no persistence in a real database in the repository, but the repository holds everyone
    - Data in the Self Contained Dummy Repositories memory
- the repository initially contains test data (possibly from Json file)
## functionality should be ensured with unit tests.
### acceptance criteria:
- Unit tests are available for repository methods
- Unit tests are available for service methods
## A web application is to be implemented that meets the following requirements:
### acceptance criteria:
- Structured UI to perform all functions
    - Create a user
    - Remove a user
    - Query all users
    - Create a permission
    - remove a permission
    - Query all permission
    - Query all permission of a user
    - Add permissions to a user
    - Remove a user's permissions
    - Add a user group
    - Remove a user group
    - Add permissions to a user group
    - Remove permissions from a user group
    - Query all permission of a user group
    - Add user groups to a user
    - Remove a user user group

# Aufgabenstellung OK Praktikum: Es soll Backend-Funktionalität umgesetzt werden, welches User verwaltung ermöglicht (German Version, [English Version](#object-model))
## Objektmodell:
- es gibt User, User Permissions und User Groups
## Architektur:
- es gibt ein Repository zum Lesen und Schreiben von User, User Permissions und User Groups
- User enthalten User Permissions und User Groups
- Permissions Haben einen Namen
- User Groups Enthalten User Permissions 
### Akzeptanzkriterien:
- die Serviceklasse stellt folgende Funktionen zur Verfügung 
    - Anlegen eines Users
    - Entfernen eines Users
    - Abfragen aller User
    - Anlegen einer Permission
    - entfernen einer Permission 
    - Abfrage aller Permission
    - Abfrage aller Permission eines Users
    - Permissions einem User hinzufügen
    - Permissions eines User Entfernen
    - Eine User Group hinzufügen
    - Eine User Group entfernen
    - Permissions einer User Group hinzufügen
    - Permissions einer User Group entfernen
    - Abfrage aller Permission einer User Group
    - Einem User User Groups hinzufügen
    - Einem User User Groups entfernen
- im Repository findet keine Persitierung  in eine reale Datenbank statt, sondern das Repository hält alle
    - Daten im Speicher Self Contained Dummy Repositories
- das Repository enthält initial Testdaten (Eventuell aus Json File)
## Funktionalität soll mit Unit-Tests abgesichert werden.
### Akzeptanzkriterien:
- für Repository-Methoden stehen Unittests bereit
- für Service-Methoden stehen Unittests bereit
## Es soll eine Webanwendung umgesetzt werden, die folgende Anforderungen erfüllt:
### Akzeptanzkriterien:
- Strukturierte UI zum ausführen aller funktionen
    - Anlegen eines Users
    - Entfernen eines Users
    - Abfragen aller User
    - Anlegen einer Permission
    - entfernen einer Permission 
    - Abfrage aller Permission
    - Abfrage aller Permission eines Users
    - Permissions einem User hinzufügen
    - Permissions eines User Entfernen
    - Eine User Group hinzufügen
    - Eine User Group entfernen
    - Permissions einer User Group hinzufügen
    - Permissions einer User Group entfernen
    - Abfrage aller Permission einer User Group
    - Einem User User Groups hinzufügen
    - Einem User User Groups entfernen
