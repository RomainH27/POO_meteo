# Description des dépendances 

- SpringWeb :
Spring Web Flow est le sous-projet de Spring Framework qui se concentre sur la fourniture de l'infrastructure nécessaire à la création et à l'exécution d'applications Web riches.

- JPA:
Java Persistence API (JPA), est une interface de programmation Java permettant aux développeurs d'organiser des données relationnelles.
Spring Data JPA, qui fait partie de la grande famille Spring Data, permet d'implémenter facilement des référentiels basés sur JPA. Ce module traite du support amélioré des couches d'accès aux données basées sur JPA. Il facilite la construction d'applications basées sur Spring qui utilisent des technologies d'accès aux données.

- Hibernate:
Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.

- H2:
H2 est un système de gestion de base de données relationnelles écrit en Java. Il peut être intégré à une application Java ou bien fonctionner en mode client-serveur.

- DevTools:
DevTools est l'abréviation de Developer Tool. L'objectif de ce module est d'essayer d'améliorer le temps de développement tout en travaillant avec l'application Spring Boot. Spring Boot DevTools reprend les modifications et relance l'application.

- Thymeleaf:
Thymeleaf est un moteur de template, sous licence Apache 2.0, écrit en Java pouvant générer du XML/XHTML/HTML5. Thymeleaf peut être utilisé dans un environnement web ou non web. Son but principal est d'être utilisé dans un environnement web pour la génération de vue pour les applications web basées sur le modèle MVC (Modèle-vue-contrôleur).


# Code du controleur

1. @GetMapping() permet de faire le lien entre l'url et le code
2. Le return de la fonction String détermine quel template sera utilisé pour l'affichage.
3. La fonction model.addAttribute() permet d'ajouter en attribut le nom passé en paramètre de l'url à l'aide de la méthode get (requestParam).

# Etape 17

On a maintenant accès à la table address dans la base de données et à la séquence liée à cette table.

# Etape 18

Hibernate permet de passer d'un modèle orienté objet et de le convertir en database.


# Etape 20

Cela marche, on a le contenu suivant :

ID--CONTENT---------------------------------CREATION  
1---57 boulevard demorieux------------------2023-01-18\
2---51 allee du gamay, 34080 montpellier----2023-01-18

# Etape 22

L'instruction @Autowired permet d'injecter directement une instance de AddressRepository dans la variable suivante.

# Ajouter Bootstrap au projet

Pour ajouter Bootstrap au projet on commence déjà par mettre la dependecy correspondante dans le pom.xml.
Ensuite il suffit de faire le lien avec le template de stylesheet voulu avec une balise linlk et le lien correspondant.
