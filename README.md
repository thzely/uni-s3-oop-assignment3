# 🛡️ RPG System: Warrior Modeling

A concise implementation of an RPG Warrior character sheet[cite: 1], demonstrating core Object-Oriented Programming (OOP) principles.

## ⚙️ Core Concepts

* **Composition:** The `Guerreiro` strictly owns a `Coracao`. The heart is created with the warrior and is destroyed if the warrior ceases to exist.
* **Aggregation & Interfaces:** To make the system extremely flexible, the warrior holds a list of `IItemEquipavel`. This allows equipping any item (like `Arma` or `Escudo`) as long as it follows the interface's rules.

## 📋 Features Implemented

1. **Encapsulation:** `Coracao` attributes are private with their respective Getters.
2. **Composition Implementation:** The default `Coracao` is instantiated directly inside the `Guerreiro` constructor.
3. **Inventory Management:** Added the `desequiparArmas()` method to clear the inventory.
4. **Status Report:** The system displays the warrior's status, heartbeats, and currently equipped weapons.
