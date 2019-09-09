``` puml
@startuml
class Person
interface ScrumRole
interface ScrumEvent
class Sprint
Sprint : 期間
class PBL
class PBI
class PSPI
class PO
PO : + 責任: ROIに責任を持つ
class SM
SM : + 責任: 環境に責任を持つ
class DEV
DEV : + 責任: 作成物に責任を持つ

class プランニング
class デイリースクラム
class PBR
class レビュー
class レトロ

Person ..o ScrumRole
Sprint .."*" PBI

PBI ..* PSPI
PBL ..* PBI
ScrumRole <.. PO
ScrumRole <.. SM
ScrumRole <.. DEV

ScrumEvent <.. プランニング
ScrumEvent <.. デイリースクラム
ScrumEvent <.. PBR
ScrumEvent <.. レビュー
ScrumEvent <.. レトロ
@enduml
```
