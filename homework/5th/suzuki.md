``` puml
@startuml

class Person {
    -マイナンバー: String
    -名前: String
    -生年月日: ZonedDatetime
    -所属会社: List<Company>
    -口座: List<IndividualAccount>
}

class Company {
    -登記識別情報: String
    -社長: Person
    -社員番号と社員: Map<String, Person>
    -最上位部門: List<Division>
    -法人口座: List<CorporationAccount>
    -プロダクト: List<Product>
}

class Division {
    -部署名: String
    -組織長: Person
    -所属社員 List<Person>
    -下位部門 List<Division>
}
note bottom: あらゆる会社の部署を一意にするためには？

abstract class Acconut {
    -口座番号: String
}

class Product {

}

class IndividualAccount {

}

class CorporationAccount {

}


Company "0..*" ..o "1..*" Person
Company "1" ..* "*" Division
Division "1" ..* "*" Division
Division "1..*" ..o "1..*" Person
Acconut <|.. IndividualAccount
Acconut <|.. CorporationAccount
Person "1" ..o "*" IndividualAccount
Company "1" ..o "*" CorporationAccount
Person .. "develop" Product
Company "1" ..o "*" Product

@enduml
```
