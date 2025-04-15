# Simple Calculator

Un projet Java simple de calculatrice pour un TP de mise en place de pipeline CI/CD.

## Fonctionnalités

- Addition
- Soustraction
- Multiplication
- Division

## Prérequis

- Java 23 ou supérieur
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

## Docker

Pour construire l'image Docker :
```
docker build -t calculator .
```

Pour exécuter l'application dans un conteneur :
```
docker run -it calculator
```

Alternativement, vous pouvez utiliser Docker Compose :
```
docker-compose up --build
```

## Analyse de sécurité

### SpotBugs

Pour lancer l'analyse SpotBugs :
```
mvn spotbugs:check
```

Pour visualiser les résultats dans l'interface graphique :
```
mvn spotbugs:gui
```

### OWASP Dependency Check

Pour analyser les vulnérabilités dans les dépendances :
```
mvn dependency-check:check
```

#### Configuration avancée

Le plugin OWASP Dependency Check est configuré avec des paramètres simplifiés pour fonctionner dans un environnement de TP.

Pour une analyse plus complète, vous pouvez obtenir une clé API NVD sur https://nvd.nist.gov/developers/request-an-api-key et ajouter cette configuration au fichier pom.xml :

```xml
<nvdApiKey>VOTRE_CLE_API_ICI</nvdApiKey>
```
