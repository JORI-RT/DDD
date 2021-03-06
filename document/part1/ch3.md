# CH3 モデルと実装を結びつける
- 違うプロセスを経て、最終成果物が非常に似ていた
    - アナリストが分析したモデルはドメインの性質に忠実だった。  
    しかし、トランザクションの整合性を保つことができないため、分析した概念をもとに開発者達は、その場しのぎの設計を行った。  
    - C++ のプロジェクトを Javaでマイグレーション。
- モデルは重要。  




### モデル駆動設計(MODEL-DRIVEN DESIGN)
- ドメインモデルを持たず、次々と機能追加を行うプロジェクトは、2章の恩恵をほとんど受けない。
- 分析モデルはビジネスドメインを分析した結果できるもの。  
ビジネスドメインを理解するためだけのため、実装を含めると理解しづらくなると考えられているため、コーディングに落とし込めない。  
開発者が設計のためのモデリングをすると、元の分析モデルはほとんど失われる。  
    - 設計とモデルの紐付けを維持するのは費用対効果が低いから。  
- 重要な発見は、設計や実装の努力をする際に現れる。  
    - 開発者が分析は別のプロセスだと思うと、モデリングは規則正しいやり方で行われない。 
    - マネージャが分析を別のプロセスだと思うと、ドメインエキスパートと接する機会を与えなくなる。

**設計がドメインモデルに紐づいていなければ、分析モデルに価値はない。  
仕様変更で紐付けを維持できなくなってしまう。**

- モデル駆動設計は、分析モデルと設計はという二分法を捨て去って、両方の目的に使える単一のモデルを探しだす。
- モデルと設計を結びつけることは現実的に可能。  
- 片方の制約によって、紐付けを弱くすることはあってはならない。
- 多数のイテレーションと大量のリファクタリングによって、モデルは適切なものとなる。  
**設計する際には、強固なユビキタス言語を支えられ、ドメインと実装の両方の目的に仕えるモデルを要求する**




---

### モデルパラダイムとツールによるサポート
- オブジェクト指向プログラミングは、モデルを構成する概念に実装を提供する。


- 手続き型言語は、自然な概念との一致が見れる。  
ただし、データをまとめたものでしかなく、ドメインの活動的な側面は捉えられない。  
    - 想定される実行パスに基づいてつなぎ合わせるだけで、ドメインモデルの概念的なつながりを反映できない。  
    数学的関数は表現できるが、関数の先にある表現ができない。

---
### 骨格を見せる:なぜモデルがユーザにとって重要なのか？
- ブラウザの「お気に入り」の実態はファイル。
    - もし、ファイルであることがわかれば、もっといい使い方を考えつくかもしれないし、よくわからない障害に悩まないかもしれない。  

---
### 実践的モデラ
- ソフトウェア開発は全てが設計。  
分析、モデリング、設計、プログラミングの責任を過剰に分離することは、モデル駆動開発の妨げになる。  



---
### まとめ
- ドメイン駆動設計は、モデルがアプリケーションの問題を解決できる。
- 知識を噛み砕くと、混沌とした情報を実用的なモデルへ蒸留できる。
- モデル駆動雪渓は、モデルと実装を密接に結びつける。
- ユビキタス言語は、それらすべての情報のためであり、開発者、ドメインエキスパート、ソフトウェアの間で情報が淀みなく会話できる。

- 上記を実践できれば、コアドメインに対する基本的な理解に基づいた、豊富な機能を提供するソフトウェアができる。

---
### 議論したいこと
- 関数型とオブジェクト指向のメリット・デメリットってなんだっけ？  
Java自体はオブジェクト指向言語だが、lambda式等の関数型の考えがだいぶ導入されている。  


↓高木疑問点
** 設計の根本に概念がないソフトウェアは役に立つことはあっても、その行為を説明することはできない  
  行為を説明できると何がどれくらい嬉しいのか

A ： 回収するときに困る

** DDDを採用するファクターは何があるか ** 
  　規模以外に    

A ： 保守の期間の長さや仕様変更の数
  
 ** モデルの成果物は何か   **
  コード以外に

A ： ユースケース、とかとか　、最強なのはコードだが、、、

** モデリングはアジャイルコンテキストではPO、PMがメイン？ **

A ： ユーザストーリがモデル成果物に近いので、PO、PMがメイン？



