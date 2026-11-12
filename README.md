# Java RecSys Project

```mermaid
classDiagram
    class UserBaserCF
    class Parser {
        +parseReviewData()
        +parseMovieData()
        +parseTagData()
    }
    class SVDAlg
    class Storage
    class TwoTowerModel["TwoTower Model"]
    class Recommender {
        <<Interface>>
    }
    class Evaluation
    class Service
    class Interface

    UserBaserCF --> Storage
    UserBaserCF --> Recommender
    Parser --> Storage
    SVDAlg --> Recommender
    SVDAlg --> Storage
    TwoTowerModel --> Recommender
    TwoTowerModel --> Storage
    Recommender --> Service
    Evaluation --> Recommender
    Service --> Storage
    Service --> Interface
```