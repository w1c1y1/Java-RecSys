# Java RecSys Project

```mermaid
classDiagram
    class UserBaserCF
    class Parser
    class SVDAlg
    class Storage
    class TwoTowerModel["TwoTower Model"]
    class Recommender {
        <<Interface>>
        attributes
    }
    class Evaluation
    class Service
    class Interface

    UserBaserCF ..> Storage
    UserBaserCF ..> Recommender
    Parser --> Storage
    SVDAlg ..> Recommender
    SVDAlg ..> Storage
    TwoTowerModel ..> Recommender
    Recommender ..> Service
    Evaluation ..> Recommender
    Service --> Storage
    Service --> Interface
```