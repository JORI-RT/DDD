``` puml
@startuml
Object Me
Object CompanyA
Object DepartmentA
Object Account
Object Product
Object Term


DepartmentA .."*" Product
CompanyA . Me : send money
CompanyA o.. DepartmentA
DepartmentA o.. Me
Product .. Term
Term "*".. Me
Account ..o Me
@enduml
```
