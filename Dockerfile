# Stage 1: Build
FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /build

COPY pom.xml .
COPY src ./src

RUN mvn clean package

# Stage 2: Final
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy Selenium Java scripts into the container
COPY --from=build /build/target/*.jar /app/selenium-scripts.jar

# Install Chrome browser and WebDriver
RUN apk update && \
    apk add chromium chromium-chromedriver && \
    rm -rf /var/cache/apk/*

# Set Chrome WebDriver system property
ENV CHROME_DRIVER_PATH /usr/lib/chromium/chromedriver
ENV WEBDRIVER_CHROME_DRIVER $CHROME_DRIVER_PATH

# Execute your Selenium Java scripts
CMD ["java", "-jar", "selenium-scripts.jar"]
