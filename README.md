# TP1 EX3
Dans cet exercice, nous avons créé deux classes : `Rectangle` et `TestRectangle`.  
* La classe `Rectangle` définit un objet rectangle avec des attributs pour la largeur et la longueur, ainsi que des méthodes pour calculer le périmètre, la diagonale et doubler la longueur.  
Le constructeur initialise les attributs.  
* La classe `TestRectangle` sert à tester la classe Rectangle.  
Nous avons créé une instance de Rectangle avec une largeur de 4 et une longueur de 3.  
Ensuite, nous avons utilisé les méthodes `perimetre()`, `diagonale()`, et `doubler()` pour calculer et afficher le périmètre, la diagonale, et la longueur doublée du rectangle.

# TP2 EX1
Dans ce travail, nous avons créé la classe `Livre` avec des attributs privés tels que le titre, l'auteur, le prix et l'ID.  
Pour accéder à ces attributs privés, nous avons utilisé des méthodes publiques :  
* placer le main dans le fichier class  
* créer une méthode publique `affiche()`  
* les accesseurs getters, setters

Un constructeur a été créé pour initialiser un objet `Livre` avec ces attributs.  
De plus, une méthode publique `affiche()` a été implémentée pour afficher le titre d'un livre.  
Enfin, une méthode `toString()` a été ajoutée pour obtenir une représentation textuelle du livre.  
Le programme de test `LivreTest` démontre la création d'objets `Livre`, la modification du titre d'un livre, et l'utilisation de ces méthodes.  
Le nombre total de livres créés est suivi à l'aide d'une variable statique `Nb`.