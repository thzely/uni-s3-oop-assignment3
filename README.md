# 🛡️ RPG System: Warrior Modeling

## 📖 About the Project
[cite_start]This repository contains the implementation of an RPG system modeling focused on a Warrior character sheet. The main goal of the project is to apply fundamental Object-Oriented Programming (OOP) concepts in the construction and relationship between the system's classes.

## ⚙️ Architecture and Applied Concepts

* [cite_start]**Composition:** Established in the direct relationship between the `Guerreiro` and `Coracao` classes[cite: 2]. [cite_start]This business rule defines that the heart is born with the warrior[cite: 3]. [cite_start]Consequently, if the warrior ceases to exist in the game, their heart is also destroyed[cite: 2].
* [cite_start]**Aggregation and Interfaces:** To make the system extremely flexible [cite: 10][cite_start], the relationship between the warrior and their equipment was transformed into an aggregation[cite: 11]. [cite_start]The `Guerreiro` has a list of the `IItemEquipavel` type[cite: 11]. 
* [cite_start]**Polymorphism:** Interfaces are excellent for working alongside Aggregation, as they allow the Warrior to change or equip any type of item that follows the interface's rules, not just weapons[cite: 9]. [cite_start]This means they can equip instances of `Arma` (Weapon), `Escudo` (Shield), or anything else created in the future[cite: 12].

## 📋 Tasks and Implemented Features

[cite_start]The structure meets the following modeling requirements[cite: 4]:

1. [cite_start]**Encapsulation of the Coracao class:** The class attributes were encapsulated as private, ensuring secure access through the creation of their respective Getters[cite: 5].
2. [cite_start]**Instantiation by Composition:** In the `Guerreiro` constructor, the default `Coracao` was instantiated to tie the lifecycle of the two objects[cite: 6].
3. [cite_start]**Inventory Management:** Implementation of the removal method (`desequiparArmas()` / `desequiparItens()`) in the `Guerreiro` class to clear the weapon/item inventory[cite: 7, 21].
4. [cite_start]**Status Report:** Creation of the `exibirStatus()` method to display the warrior's status, the heartbeats, and the weapons they carry[cite: 8, 22].
