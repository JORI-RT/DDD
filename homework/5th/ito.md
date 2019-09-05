``` puml
@startuml

class 会社A {
    -会社名: String
    -部署:List<部署>
}

class 部署 {
    -部署名: String
    -社員:List<社員>
    -プロダクト:List<プロダクト>
}

class 社員 {
    -名前: String
    -階級: String
    -担当名: String
    -入社年月日: String
    -勤続年数: int
    -口座: List<口座>
    
    --
    -仕事(Salary):Sales
}

class プロダクト {
    -プロダクト名:String
    -メンバー：List<社員>
}

abstract class 口座 {
    -口座番号: String
}


会社A "1" o.. "1..*" 部署
部署 "1" o.. "1..*" 社員
部署 "1" o.. "1..*" プロダクト
プロダクト "1" o.. "1..*" 社員
社員 "1" o.. "1..*" 口座

@enduml
```
