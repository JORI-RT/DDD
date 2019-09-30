``` puml
@startuml
note
スクラムは可視化するためのFW
end note

Object Person
Object ScrumRole
Object ScrumEvent
Object Sprint
Sprint : 期間
Object PBL
Object PBI
Object PSPI

Person ..o ScrumRole
Sprint .."*" PBI

PBI ..* PSPI
PBL ..* PBI
@enduml
```
