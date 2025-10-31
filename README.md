
Exercice 5 : Les Strings [BaseEx5String]

Cette petite application Java regroupe plusieurs mini-exercices autour des **`String`** :
1. tester si une chaîne est un **palindrome** (en ignorant les espaces et la casse),
2. **concaténer** deux chaînes de deux manières,
3. **chercher** un mot dans une phrase,
4. **remplacer** un mot saisi par l’utilisateur dans une phrase.

Tout se fait en **console**.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Règles-du-jeu](#règles-du-jeu)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. Ayez **Java (JDK 8+)** installé.
2. Créez un fichier `BaseEx5String.java`.
3. Collez le code fourni.
4. Compilez :

   ```bash
   javac BaseEx5String.java
    ```

5. Exécutez :

   ```bash
   java BaseEx5String
   ```

## Utilisation

À l’exécution, le programme fait plusieurs choses **dans l’ordre** :

1. **Test de palindrome**

   * Il teste directement la chaîne :

     ```text
     "elu par cette crapule"
     ```
   * Il affiche `true` si c’est un palindrome, sinon `false`.
     (Ici ça affichera `true` après avoir écrit les comparaisons lettre par lettre dans la console.)

2. **Concaténation de chaînes**

   * Il crée :

     ```java
     String a = "Premiere phrase";
     String b = "Deuxième phrase";
     ```
   * Puis affiche :

     ```text
     Premiere phrase,Deuxième phrase
     Premiere phrase,Deuxième phrase
     ```

     une fois avec `+` et une fois avec `concat(...)`.

3. **Recherche / remplacement dans une phrase**

   * Phrase de départ :

     ```text
     il fait beau aujourd'hui
     ```
   * Le programme affiche :

     ```text
     Dans la phrase suivante : il fait beau aujourd'hui
     entrez un mot à trouver
     ```
   * Vous tapez par exemple : `beau`
   * Le programme cherche le mot dans le tableau de mots, et si trouvé affiche `trouvé`
   * Puis il demande :

     ```text
     par quel mot voulez vous le remplacer ?
     ```
   * Vous tapez par ex. : `moche`
   * Le programme affiche :

     ```text
     il fait moche aujourd'hui
     ```

⚠️ La recherche/remplacement est **sensible à la casse** et au **mot exact** (pas de sous-chaîne).

## Règles du jeu

1. Le palindrome est testé en **enlevant les espaces** et en **mettant en minuscule**.
2. Le test de palindrome compare les caractères **de gauche à droite et de droite à gauche**.
3. La phrase sur laquelle on cherche/remplace est **fixe** dans le code :

   ```text
   il fait beau aujourd'hui
   ```
4. Le mot recherché doit être **exactement** un des mots de la phrase (séparés par espace).
5. Le remplacement ne change **que les mots égaux** au mot demandé.

## Fonctionnalités

* ✅ Test de **palindrome** avec nettoyage (espaces supprimés, minuscule)
* ✅ Affichage des **paires de caractères comparées** lors du test
* ✅ Deux méthodes de **concaténation** (`+` et `concat`)
* ✅ **Découpage** d’une phrase en mots avec `split(" ")`
* ✅ **Recherche** d’un mot dans un tableau de mots
* ✅ **Remplacement** d’un mot par un autre puis **reconstruction** de la phrase avec `String.join(...)`
* ✅ Interaction **utilisateur** via `Scanner`

## Structure du code

* **`public static void main(String[] args)`**

  * appelle `isPalindrome("elu par cette crapule")`
  * montre deux façons de concaténer
  * prépare la phrase : `il fait beau aujourd'hui`
  * demande à l’utilisateur :

    1. le mot à chercher
    2. le mot de remplacement
  * appelle `findWord(...)`
  * appelle `replaceWord(...)`
  * affiche la nouvelle phrase

* **`public static boolean isPalindrome(String word)`**

  * enlève les espaces → `replace(" ", "")`
  * met en minuscule → `toLowerCase()`
  * compare premier/dernier, deuxième/avant-dernier, etc.
  * retourne `true` si tout matche

* **`public static void findWord(String wordToFind, String[] sentenceArray)`**

  * parcourt le tableau de mots
  * affiche `"trouvé"` si le mot est présent

* **`public static String replaceWord(String wordToFind, String replacementWord, String[] sentenceArray)`**

  * remplace toutes les occurrences exactes
  * re-concatène les mots avec `String.join(" ", sentenceArray)`
  * retourne la phrase modifiée


