# 🛡️ RPG System: Warrior Modeling

## 📖 About the Project
This repository contains the implementation of an RPG system modeling focused on a Warrior character sheet. The main goal of the project is to apply fundamental Object-Oriented Programming (OOP) concepts in the construction and relationship between the system's classes.

## ⚙️ Architecture and Applied Concepts

**Composition:** Established in the direct relationship between the `Guerreiro` and `Coracao` classes. This business rule defines that the heart is born with the warrior. Consequently, if the warrior ceases to exist in the game, their heart is also destroyed.
**Aggregation and Interfaces:** To make the system extremely flexible, the relationship between the warrior and their equipment was transformed into an aggregation. The `Guerreiro` has a list of the `IItemEquipavel` type. 

**Polymorphism:** Interfaces are excellent for working alongside Aggregation, as they allow the Warrior to change or equip any type of item that follows the interface's rules, not just weapons. This means they can equip instances of `Arma` (Weapon), `Escudo` (Shield), or anything else created in the future.

## 📋 Tasks and Implemented Features

The structure meets the following modeling requirements:

1. **Encapsulation of the Coracao class:** The class attributes were encapsulated as private, ensuring secure access through the creation of their respective Getters.
2. **Instantiation by Composition:** In the `Guerreiro` constructor, the default `Coracao` was instantiated to tie the lifecycle of the two objects.
3. **Inventory Management:** Implementation of the removal method (`desequiparArmas()` / `desequiparItens()`) in the `Guerreiro` class to clear the weapon/item inventory.
4. **Status Report:** Creation of the `exibirStatus()` method to display the warrior's status, the heartbeats, and the weapons they carry.
