# Étape 1: Build de l'application avec Maven
FROM maven:3.9-eclipse-temurin-23 AS build

WORKDIR /app

# Copier les fichiers de configuration Maven
COPY pom.xml .

# Télécharger les dépendances Maven (mise en cache des couches Docker)
RUN mvn dependency:go-offline -B

# Copier le code source
COPY src ./src

# Compiler l'application
RUN mvn clean package

# Étape 2: Créer l'image d'exécution
FROM eclipse-temurin:23-jre-alpine

WORKDIR /app

# Copier le JAR compilé depuis l'étape de build
COPY --from=build /app/target/calculator-1.0-SNAPSHOT.jar ./app.jar

# Exposer le port si nécessaire (pour une future interface web)
# EXPOSE 8080

# Définir le point d'entrée
ENTRYPOINT ["java", "-jar", "app.jar"]
