``` puml
@startuml

Object Me
Object CompanyA
Object MyAccount
Object Product


Me .."*" Product : develop
Product .."*" CompanyA : profit
CompanyA . MyAccount : send money
CompanyA o.. Me
MyAccount ..o Me

@enduml
```
