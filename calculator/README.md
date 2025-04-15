# Simple Calculator

Un projet Java simple de calculatrice pour un TP de mise en place de pipeline CI/CD.

## Fonctionnalités

- Addition
- Soustraction
- Multiplication
- Division

## Prérequis

- Java 11 ou supérieur
- Maven

## Compilation et exécution

Pour compiler le projet :
```
mvn clean package
```

Pour exécuter l'application :
```
java -jar target/calculator-1.0-SNAPSHOT.jar
```

## Analyse avec SpotBugs

Pour lancer l'analyse SpotBugs :
```
mvn spotbugs:check
```

Pour visualiser les résultats dans l'interface graphique :
```
mvn spotbugs:gui
```
