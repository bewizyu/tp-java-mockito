# Enoncé de la vérification


## Vérification N appel de méthode sur un mock 

1. Ecrire un test unitaire qui permet d'appeler l'application (classe ```AppLauncher```), en lui fournissant les saisies utilisateurs suivantes : ```"1+2 3+4 5+10 19+0 fin"```
2. Vérifier que la méthode ```additionner```de ```CalculService``` a été appelée 4 fois

## Vérifier aucun appel de méthode sur un mock

1. Ecrire un test unitaire qui permet d'appeler l'application (classe ```AppLauncher```), en lui fournissant les saisies utilisateurs suivantes : ```"fin"```
2. Vérifier que la méthode ```evaluer```de ```App``` n'a jamais été appelée