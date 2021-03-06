


```puml
@startuml

class ステークホルダー {
    ビジネス環境
    想像
    開発費
    ---
    List<価値のあるプロダクト> getProduct(ビジネス環境, 想像, 開発費))
    
}



interface プロダクト開発 {
    ---
    List<価値のあるプロダクト> makeProduct(ビジネス要件)
    List<ビジネス要件> getProductDesign(ビジネス環境, 想像)
}

package スクラム開発 {
    class スプリント {
        期間（1週間）
        List<タスク>
        ---
        List<価値のあるプロダクト> makeProduct(ビジネス要件)
        List<ビジネス要件> getProductDesign(ビジネス環境, 想像)
    }

    interface スクラムチーム
    class PO {
        プロダクトに対しての責任
        ---
        PBI maxROI(ビジネス要件)
    }
    class SM {
        スクラムチームの環境に対しての責任
        ---
        void modEnviroment(スクラムチーム)
        進捗状況 tracking(スプリント)
    }
    class DEV {
        作業プロセスとスプリント内にタスクをコミットすることに対する責任
        ---
        価値のあるプロダクト makeProduct(PBI)
    }

    
    interface スクラムイベント
    class プランニング
    class デイリースタンドアップミーティング
    class リファインメント
    class スプリントレビュー
    class レトロスペクティブ

}


ステークホルダー "1" -- "1..*" プロダクト開発 : < 確実に動くプロダクトを届ける 
プロダクト開発 <|-- スプリント : < プロダクトを開発する
スプリント "1" o-- "1..*" スクラムチーム: < プロダクトを届けることに責任を持つ
スプリント "1" o-- "1" スクラムイベント: < スクラムのためのツール
スクラムチーム <|.. PO
スクラムチーム <|.. SM
スクラムチーム <|.. DEV
スクラムイベント <|.. プランニング
スクラムイベント <|.. デイリースタンドアップミーティング
スクラムイベント <|.. リファインメント
スクラムイベント <|.. スプリントレビュー
スクラムイベント <|.. レトロスペクティブ

@enduml
```

スクラムチーム
SM
PO
DEV
ステークホルダー

スクラムイベント
スプリント
プランニング
デイリースタンドアップミーティング
リファインメント
スプリントレビュー
レトロスペクティブ


スクラムについて
スクラムはステークホルダーに早くプロダクトを提供するための開発手法

プロダクトは1週間程度の短いスパンで確実に動くプロダクトを繰り返し届ける

ステークホルダーの事業環境の変化に柔軟に対応し、その時に最適なプロダクトを届ける

各ロールについて
PO
プロダクトの内容に責任を持つ

SM
スクラムチームの環境に責任を持つ

DEV
作業プロセスとスプリント内にタスクをコミットすることに責任を持つ


