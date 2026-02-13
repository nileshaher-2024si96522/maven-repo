# SonarQube Test Project

A simple Maven-based project for testing SonarQube code coverage analysis.

## Project Structure

```
mvn_project/
├── pom.xml                          # Maven configuration
├── sonar-project.properties         # SonarQube configuration
├── src/
│   ├── main/java/com/example/
│   │   └── App.java                 # Simple calculator class
│   └── test/java/com/example/
│       └── AppTest.java             # Unit tests
└── README.md                        # This file
```

## Building the Project

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Build Commands

Build the project:
```bash
mvn clean compile
```

Run tests:
```bash
mvn test
```

Run tests with code coverage (JaCoCo):
```bash
mvn clean test jacoco:report
```

The JaCoCo coverage report will be generated at: `target/site/jacoco/index.html`

## Integration with SonarQube

### 1. Start SonarQube (Docker)

```bash
docker run -d --name sonarqube -p 9000:9000 sonarqube:latest
```

Then navigate to `http://localhost:9000` and login with default credentials (admin/admin).

### 2. Run Analysis

Analyze the project with SonarQube:

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=com.example:sonarqube-test-project \
  -Dsonar.projectName="SonarQube Test Project" \
  -Dsonar.sources=src/main \
  -Dsonar.tests=src/test \
  -Dsonar.java.binaries=target/classes \
  -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=your-sonarqube-token
```

Or update `sonar-project.properties` with your SonarQube host URL and token, then run:

```bash
mvn clean verify sonar:sonar
```

## Code Quality Metrics

The project includes:

- **App.java**: Calculator class with 6 public methods
  - add(int, int)
  - subtract(int, int)
  - multiply(int, int)
  - divide(int, int)
  - isPositive(int)
  - isEven(int)

- **AppTest.java**: Comprehensive unit tests covering:
  - Normal cases
  - Edge cases (zero, negative numbers)
  - Exception handling

## Coverage Goals

Target metrics for SonarQube:
- **Line Coverage**: > 80%
- **Branch Coverage**: > 75%
- **Code Smells**: 0
- **Bugs**: 0

## Dependencies

- JUnit 4.13.2 (for unit testing)
- SLF4J (for logging)
- JaCoCo (for code coverage)

## License

MIT License

