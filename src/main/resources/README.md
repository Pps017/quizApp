
# Quiz App API

This is a Spring Boot application that provides APIs for a quiz application. The APIs allow users to:

1. Start a new quiz session.
2. Retrieve a random multiple-choice question.
3. Submit an answer to a question.
4. Get a summary of the quiz session, including the total number of questions answered and the number of correct/incorrect answers.

## How It Works

### 1. **Start a New Quiz Session**
- Endpoint: `POST /api/quiz/start`
- A new session is created, identified by a unique session ID.

### 2. **Retrieve a Random Question**
- Endpoint: `GET /api/quiz/question`
- Requires `sessionId` as a query parameter.
- Returns a random question from the database.

### 3. **Submit an Answer**
- Endpoint: `POST /api/quiz/submit`
- Requires `sessionId`, `questionId`, and `answer` as query parameters.
- Evaluates the answer and returns whether it is correct or not.

### 4. **Get Quiz Summary**
- Endpoint: `GET /api/quiz/summary`
- Requires `sessionId` as a query parameter.
- Returns the total questions answered, and the number of correct and incorrect answers.

## Setup

1. Clone the repository.
2. Run the application using your IDE or command line (`mvn spring-boot:run`).
3. Access the H2 console at `http://localhost:8080/h2-console` (use `jdbc:h2:mem:testdb` as the JDBC URL).

## Database
- Uses an in-memory H2 database.
- Seeded with sample questions on startup using the `DataSeeder` class.

## Sample Questions
- What is the capital of France? (Options: Paris, London, Rome, Berlin)
- What is 2 + 2? (Options: 3, 4, 5, 6)

## Technologies
- Spring Boot
- H2 Database
- JPA

---
Enjoy using the Quiz App API! Feel free to enhance it further as needed.
