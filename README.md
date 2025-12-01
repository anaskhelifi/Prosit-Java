🦁 Zoo Management — Java OOP Project

Un projet Java orienté objet qui simule la gestion d’un zoo, utilisant l’héritage, l’encapsulation, le polymorphisme et les packages.

📌 Description

Ce projet met en œuvre progressivement plusieurs notions fondamentales de la programmation orientée objet (POO) en Java, en passant par :

Création de classes (Animal, Zoo, Aquatic, Terrestrial, etc.)

Constructeurs par défaut et paramétrés

Encapsulation et validation des attributs

Héritage et classes dérivées (Dolphin, Penguin)

Polymorphisme avec redéfinition de méthodes (toString(), swim())

Gestion d’un tableau d’animaux dans un Zoo

Méthodes d’ajout, suppression et recherche

Utilisation de packages organisés

Le projet suit les instructions pédagogiques allant de l’instruction 1 à 24.

📁 Architecture du projet
src/
└── tn/
    └── esprit/
        └── gestionzoo/
            ├── entities/
            │   ├── Animal.java
            │   ├── Aquatic.java
            │   ├── Terrestrial.java
            │   ├── Dolphin.java
            │   ├── Penguin.java
            │   └── Zoo.java
            └── main/
                └── ZooManagement.java

🐾 Fonctionnalités principales
✔ Gestion des animaux

Ajout d’un animal dans un zoo

Suppression d’un animal

Recherche d’un animal par nom

Affichage de la liste des animaux

Unicité d’un animal (pas de doublon)

Limite maximale : 25 animaux

✔ Animaux et héritage

Animal : classe parent

Aquatic & Terrestrial : classes filles

Dolphin & Penguin : sous-classes spécialisées

Redéfinition de toString() et swim()

Polymorphisme : appel dynamique de swim()

✔ Gestion du Zoo

Vérification si le zoo est plein

Comparaison entre deux zoos

Encapsulation : nom non vide, âge ≥ 0
