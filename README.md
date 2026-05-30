# RPG System: Warrior Modeling

A concise implementation of an RPG Warrior character sheet, demonstrating core Object-Oriented Programming (OOP) principles.

## Features Implemented

* **Composition:** The `Guerreiro` strictly owns a `Coracao`. The heart is created with the warrior and is destroyed if the warrior ceases to exist.
* **Aggregation & Interfaces:** To make the system extremely flexible, the warrior holds a list of `IItemEquipavel`. This allows equipping any item (like `Arma` or `Escudo`) as long as it follows the interface's rules.
