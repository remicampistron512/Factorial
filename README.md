
# Exercice 6 : Factorielle (récursivité)

Cette petite application Java montre comment calculer la **factorielle** d’un nombre à l’aide d’une **méthode récursive**. La factorielle est définie par :  
- `0! = 1`  
- `n! = n × (n-1) × (n-2) × ... × 1` pour `n > 0`

Ici, le programme affiche simplement `factorial(4)` → `24`.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. Assurez-vous d’avoir **Java (JDK 8+)**.
2. Créez l’arborescence suivante (respect du package) :

   ```text
   .
   └── factorial
       └── Factorial.java
    ```

3. Dans `factorial/Factorial.java`, mettez le code :

   ```java
   package factorial;

   public class Factorial {
   	
   	public static void main(String[] args) {
   		System.out.println(factorial(4));
   	}
   	
   	/** 
   	 *  Méthode qui met en œuvre la notion de factorielle telle que n ! = n*(n-1) …*
   	 * @param n
   	 * @return
   	 */
   	public static int  factorial(int n) {
   		if(n == 0) {
   			return 1;
   		} 
   			return n * factorial(n -1);
   	
   	}
   }
   ```

4. Compilez depuis le dossier parent :

   ```bash
   javac factorial/Factorial.java
   ```

5. Exécutez :

   ```bash
   java factorial.Factorial
   ```

## Utilisation

* Le programme est actuellement **câblé** pour calculer `factorial(4)`.

* À l’exécution, la console affiche :

  ```text
  24
  ```

* Pour tester un autre nombre, modifiez la ligne suivante dans `main` :

  ```java
  System.out.println(factorial(7)); // par exemple
  ```


## Fonctionnalités

* ✅ Calcul récursif de la factorielle
* ✅ Cas de base `n == 0`
* ✅ Exemple d’appel dans `main`
* ✅ Code court et pédagogique
* 🧪 Facile à faire évoluer : lecture au clavier, version itérative, contrôle des bornes

## Structure du code

* **Package :** `factorial`

* **Classe :** `Factorial`

  * `public static void main(String[] args)` : point d’entrée, affiche le résultat de `factorial(4)`
  * `public static int factorial(int n)` :

    * si `n == 0` → retourne `1`
    * sinon → retourne `n * factorial(n - 1)` (appel récursif)

* **Vue d’ensemble :**

  ```text
  factorial/
  └── Factorial.java
   ```


