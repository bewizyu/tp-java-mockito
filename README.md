# Enoncé de la vérification


## Vérification N appel de méthode sur un mock 

1. Ecrire un test unitaire qui appelle la méthode de traitement de la classe ```App```, en lui fournissant les saisies utilisateurs suivantes : "1+2" puis "3+4" puis "5+10" puis "19+0" puis "fin"
2. Vérifier que la méthode ```additionner```de ```CalculService``` a été appelée 4 fois

## Vérifier aucun appel de méthode sur un mock

1. Ecrire un test unitaire qui appelle la méthode de traitement de la classe ```App```,en lui fournissant les saisies utilisateurs suivantes : "fin"
2. Vérifier que la méthode ```additionner```de ```CalculService``` n'a jamais été appelée

## Utiliser des Argument Matcher

1. Ecrire un test unitaire qui appelle la méthode de traitement de la classe ```App```, en lui fournissant les saisies utilisateurs suivantes : "1+2" puis "fin"
2. Vérifier que la méthode ```additionner```de ```CalculService``` a été appelée 1 fois avec ```"1+2"``` en paramètre 

